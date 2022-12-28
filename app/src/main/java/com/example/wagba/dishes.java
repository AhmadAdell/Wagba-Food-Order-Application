package com.example.wagba;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.wagba.databinding.ActivityDishesBinding;
import com.example.wagba.databinding.ActivityMainBinding;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class dishes extends AppCompatActivity {
ActivityDishesBinding bind;
    DatabaseReference dbref;
    RecyclerView recyclerView;
    String restid;
    ArrayList<DishModel> dishmodel=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityDishesBinding.inflate(getLayoutInflater());
        View view = bind.getRoot();
        setContentView(view);
        Intent intent02 = getIntent();
        Bundle extras = intent02.getExtras();
        String restuarantName = extras.getString("restuarantName");
        String restuarantStatus = extras.getString("restuarantstatus");
        String restuarantid = extras.getString("restuarantid");
        bind.restname.setText(restuarantName);
        bind.reststatus.setText(restuarantStatus);



        DIshAdapter dIshAdapter=new DIshAdapter(dishmodel,restuarantName);
        bind.dishesrv.setAdapter(dIshAdapter);
        dbref = FirebaseDatabase.getInstance().getReference("dishes").child(restuarantid);
        dbref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                dishmodel.add(snapshot.getValue(DishModel.class));
                dIshAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}