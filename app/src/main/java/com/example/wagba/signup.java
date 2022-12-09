package com.example.wagba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.wagba.databinding.ActivityDishesBinding;
import com.example.wagba.databinding.ActivitySignupBinding;

public class signup extends AppCompatActivity {
ActivitySignupBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivitySignupBinding.inflate(getLayoutInflater());
        View view = bind.getRoot();
        setContentView(view);
    }



}