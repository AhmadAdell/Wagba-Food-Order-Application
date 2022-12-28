package com.example.wagba;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wagba.databinding.FragmentBasketBinding;
import com.example.wagba.databinding.FragmentRestfragBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;


public class basket extends Fragment {
FragmentBasketBinding bind;
DatabaseReference dref;
TextView tprice;
float pricecalc ;
    RecyclerView recyclerView;
    ArrayList<DishModel> ItemsModels=new ArrayList<>();


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public basket() {
        // Required empty public constructor
    }


    public static basket newInstance(String param1, String param2) {
        basket fragment = new basket();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        bind = FragmentBasketBinding.inflate(getLayoutInflater());
        View view = bind.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
     ItemsModels = basketholder.getinstance().getItemsModels();
        tprice = bind.tprice;
        pricecalc = 0;
DIshAdapter dIshAdapter = new DIshAdapter(ItemsModels);
for (int i=0;i<ItemsModels.size(); i++)
{
    pricecalc += Float.valueOf(ItemsModels.get(i).getDishPrice());

}

tprice.setText(Float.toString(pricecalc));


       // ItemAdapter itemAdapter=new ItemAdapter(ItemsModels);
        bind.basketrv.setAdapter(dIshAdapter);



        bind.checkoutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(getActivity(), payment.class);
                send.putExtra("total price",tprice.getText().toString());
                Log.d("ahmed123",tprice.getText().toString());
                startActivity(send);
            }
        });
        bind.logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent login = new Intent(getContext(), MainActivity.class);

                startActivity(login);
               getActivity().finish();
            }
        });

    }

    public void onDestroyView() {
        super.onDestroyView();
        bind = null;
    }
}