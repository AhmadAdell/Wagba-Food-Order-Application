package com.example.wagba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wagba.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    //RecyclerView recyclerView;


   // ArrayList<UsersModel> usersModels=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
       View view = binding.getRoot();
        setContentView(view);

        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.logfragmain,new LoginFrag());
        ft.commit();
//        usersModels.add(new UsersModel("Ahmed","11"));
//        usersModels.add(new UsersModel("moahmed","54"));
//        usersModels.add(new UsersModel("ayman","22"));
//        usersModels.add(new UsersModel("mahmoud","23"));
//        usersModels.add(new UsersModel("mohamed","65"));
//        usersModels.add(new UsersModel("Ahmed","44"));
//        usersModels.add(new UsersModel("mahmoud","27"));
//
//
//
//
//        UsersAdapter usersAdapter=new UsersAdapter(usersModels);
    }
}