package com.example.wagba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.Viewholder> {

    ArrayList<ItemModel>ItemsModelsinternal;

    public ItemAdapter(ArrayList<ItemModel> ItemsModels) {
        this.ItemsModelsinternal=ItemsModels;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.card_layout,parent,false);

        Viewholder viewholder=new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        ItemModel ItemModel=   ItemsModelsinternal.get(position);
        holder.name.setText(ItemModel.getCourse_name());
        holder.age.setText(ItemModel.getCourse_rating());
    }

    @Override
    public int getItemCount() {
        return ItemsModelsinternal.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        TextView name,age;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.checkouttxt);
            age =itemView.findViewById(R.id.idTVCourseRating);
        }
    }
}
