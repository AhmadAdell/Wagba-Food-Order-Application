package com.example.wagba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wagba.UsersModel;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.Viewholder> {

    ArrayList<UsersModel>usersModelsinternal;

    public UsersAdapter(ArrayList<UsersModel> usersModels) {
        this.usersModelsinternal=usersModels;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.item_users,parent,false);

        Viewholder viewholder=new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        UsersModel usersModel=   usersModelsinternal.get(position);
        holder.name.setText(usersModel.getName());
        holder.age.setText(usersModel.getAge());
    }

    @Override
    public int getItemCount() {
        return usersModelsinternal.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        TextView name,age;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.tv_name);
            age =itemView.findViewById(R.id.tv_age);
        }
    }
}
