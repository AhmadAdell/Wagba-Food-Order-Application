package com.example.wagba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.wagba.databinding.ActivityDishesBinding;
import com.example.wagba.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class dishes extends AppCompatActivity {
ActivityDishesBinding bind;
    RecyclerView recyclerView;
    ArrayList<DishModel> dishmodel=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityDishesBinding.inflate(getLayoutInflater());
        View view = bind.getRoot();
        setContentView(view);
        dishmodel.add(new DishModel("Big tasty","60 EGP",R.drawable.kfc));
        dishmodel.add(new DishModel("BIg Mac","50 EGP",R.drawable.kfc));
        dishmodel.add(new DishModel("Sunday Ice cream","30 EGP",R.drawable.kfc));
        dishmodel.add(new DishModel("Sunday Ice cream","30 EGP",R.drawable.kfc));
        dishmodel.add(new DishModel("Sunday Ice cream","30 EGP",R.drawable.kfc));
        dishmodel.add(new DishModel("Sunday Ice cream","30 EGP",R.drawable.kfc));



        DIshAdapter dIshAdapter=new DIshAdapter(dishmodel);
        bind.dishesrv.setAdapter(dIshAdapter);



    }
}