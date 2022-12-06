package com.example.wagba;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wagba.databinding.FragmentLoginBinding;
import com.example.wagba.databinding.FragmentRestfragBinding;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Restfrag#newInstance} factory method to
 * create an instance of this fragment.
 */

public class Restfrag extends Fragment {
    RecyclerView recyclerView;
    ArrayList<UsersModel> usersModels=new ArrayList<>();
    FragmentRestfragBinding fbind;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Restfrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Restfrag.
     */
    // TODO: Rename and change types and number of parameters
    public static Restfrag newInstance(String param1, String param2) {
        Restfrag fragment = new Restfrag();
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
        fbind = FragmentRestfragBinding.inflate(getLayoutInflater());
        View view = fbind.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        usersModels.add(new UsersModel("Mac","hi"));
        usersModels.add(new UsersModel("KFC","54"));
        usersModels.add(new UsersModel("Abo Mazen","22"));
        usersModels.add(new UsersModel("Ezz El Monofy","10"));
        usersModels.add(new UsersModel("PaPa Jones","27"));
        usersModels.add(new UsersModel("Cinnabon","100"));


        UsersAdapter usersAdapter=new UsersAdapter(usersModels);
        fbind.rvUsers.setAdapter(usersAdapter);
    }
    public void onDestroyView() {
        super.onDestroyView();
        fbind = null;
    }
}