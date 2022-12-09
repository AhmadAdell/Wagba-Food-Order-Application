package com.example.wagba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.wagba.databinding.ActivityDishesBinding;
import com.example.wagba.databinding.ActivityPaymentBinding;

public class payment extends AppCompatActivity {
ActivityPaymentBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityPaymentBinding.inflate(getLayoutInflater());
        View view = bind.getRoot();
        setContentView(view);


    }
}