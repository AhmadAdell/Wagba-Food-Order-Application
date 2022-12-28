package com.example.wagba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.Viewholder> {
    ArrayList<OrdersModel>ordersModelsinternal;

    public OrderAdapter(ArrayList<OrdersModel> ordermodel) {this.ordersModelsinternal = ordermodel;}

    @NonNull
    @Override
    public OrderAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.ordercard,parent,false);

       Viewholder viewholder=new Viewholder(view);
        return viewholder;
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        TextView orderno,orderstatus;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            orderno=itemView.findViewById(R.id.orderno);
            orderstatus =itemView.findViewById(R.id.orderstatus);
        }}

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.Viewholder holder, int position) {
        OrdersModel ordersmodels =ordersModelsinternal.get(position);
        holder.orderno.setText(ordersmodels.getOrderPrice());
        holder.orderstatus.setText(ordersmodels.getOrderStatus());
    }

    @Override
    public int getItemCount() {
        return ordersModelsinternal.size();
    }
}
