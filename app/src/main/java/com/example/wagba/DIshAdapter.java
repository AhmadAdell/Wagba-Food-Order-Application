package com.example.wagba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wagba.databinding.DishlayoutBinding;

import java.util.ArrayList;

public class DIshAdapter extends RecyclerView.Adapter<DIshAdapter.Viewholder> {
ArrayList<DishModel> dishmodelsinternal;
basketholder bh;
    public DIshAdapter(ArrayList<DishModel> Dishmodels) {
        this.dishmodelsinternal = Dishmodels;
    }

    @NonNull
    @Override
    public DIshAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.dishlayout,parent,false);

        Viewholder viewholder=new Viewholder(view);
        return viewholder;
    }
    public class Viewholder extends RecyclerView.ViewHolder{
        DishlayoutBinding bind;
        TextView san_name, san_price;
        Button butp , butm;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            san_name =itemView.findViewById(R.id.sandwich_name);
            san_price =itemView.findViewById(R.id.sprice);
            butp = itemView.findViewById(R.id.buttonplus);

        }}
    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        DishModel dishModel =dishmodelsinternal.get(position);
        holder.san_name.setText(dishModel.getDishName());
        holder.san_price.setText(dishModel.getDishPrice());
        holder.butp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                basketholder.getinstance().additem(dishModel);
            }
        });


    }

    @Override
    public int getItemCount() {return dishmodelsinternal.size();
    }
}
