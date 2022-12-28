package com.example.wagba;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wagba.databinding.DishlayoutBinding;
import com.example.wagba.databinding.ItemUsersBinding;

import java.util.ArrayList;

public class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantsAdapter.Viewholder> {

    ArrayList<RestaurantModel> restaurantModelsinternal;

    public RestaurantsAdapter(ArrayList<RestaurantModel> restaurantModels) {
        this.restaurantModelsinternal = restaurantModels;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.item_users,parent,false);
        ItemUsersBinding bind = ItemUsersBinding.inflate(inflater,parent,false);
        Viewholder viewholder=new Viewholder(bind);
        return viewholder;
    }

    @Override

    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        RestaurantModel restaurantModel =   restaurantModelsinternal.get(position);
        holder.bind.restName.setText(restaurantModel.getName());
        holder.bind.restStatus.setText(restaurantModel.getStatus());

        //restaurantModel.loadPic(holder.bind.cartimg,holder.bind.getRoot().getContext());
        holder.bind.getRoot().setOnClickListener(view ->{
            Context context = view.getContext();
            Intent intent = new Intent(context, dishes.class);
            String restname = restaurantModel.getName().toString();
            String reststatus = restaurantModel.getStatus().toString();
            String restid = restaurantModel.getID().toString();
            intent.putExtra("restuarantName",restname);
            intent.putExtra("restuarantstatus",reststatus);
            intent.putExtra("restuarantid",restid);
            context.startActivity(intent);

        });

    }

    @Override
    public int getItemCount() {
        return restaurantModelsinternal.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
       ItemUsersBinding bind;
        Context context;
        public Viewholder(ItemUsersBinding bind) {
            super(bind.getRoot());
             this.bind=bind;
            //context = bind.getRoot().getContext();
        }
    }
}
