package com.example.wagba;

import android.content.ClipData;
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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link basket#newInstance} factory method to
 * create an instance of this fragment.
 */
public class basket extends Fragment {
FragmentBasketBinding bind;
    RecyclerView recyclerView;
    ArrayList<ItemModel> ItemsModels=new ArrayList<>();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public basket() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment basket.
     */
    // TODO: Rename and change types and number of parameters
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

        ItemsModels.add(new ItemModel("Mac","delicious Burger Sandwiches!",R.drawable.mac));
        ItemsModels.add(new ItemModel("KFC","Fried Chicken with a secret recipe!",R.drawable.kfc));
        ItemsModels.add(new ItemModel("Abo Mazen","your favorite shawerma!",R.drawable.mac));
        ItemsModels.add(new ItemModel("Ezz El Monofy","kebda and sgo2!",R.drawable.mac));
        ItemsModels.add(new ItemModel("Ezz El Monofy","kebda and sgo2!",R.drawable.mac));
        ItemsModels.add(new ItemModel("Ezz El Monofy","kebda and sgo2!",R.drawable.mac));


        ItemAdapter itemAdapter=new ItemAdapter(ItemsModels);
        bind.basketrv.setAdapter(itemAdapter);
    }





    public void onDestroyView() {
        super.onDestroyView();
        bind = null;
    }
}