package com.example.wagba;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wagba.databinding.FragmentBasketBinding;
import com.example.wagba.databinding.FragmentRestfragBinding;

import java.util.ArrayList;


public class basket extends Fragment {
FragmentBasketBinding bind;
    RecyclerView recyclerView;
    ArrayList<ItemModel> ItemsModels=new ArrayList<>();


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

        ItemsModels.add(new ItemModel("Shawerma Sandwich","50 EGP",R.drawable.mac));
        ItemsModels.add(new ItemModel("Garlic Sauce","10 EGP",R.drawable.kfc));
        ItemsModels.add(new ItemModel("Shawerma Fatta Chicken","100 EGP",R.drawable.mac));
        ItemsModels.add(new ItemModel("PePsi 1 Litre","20 EGP",R.drawable.mac));



        ItemAdapter itemAdapter=new ItemAdapter(ItemsModels);
        bind.basketrv.setAdapter(itemAdapter);



        bind.checkoutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(getActivity(), payment.class);
                startActivity(send);
            }
        });

    }

    public void onDestroyView() {
        super.onDestroyView();
        bind = null;
    }
}