package com.example.viewpagerassignment2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class CityFragment extends Fragment {


    private ArrayList<ModelClass> list=new ArrayList<>();
    private RecyclerView recyclerView3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_city, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView3=view.findViewById(R.id.cityRecyclerView);
        buildList();
        setRecyclerView();
    }
    private void buildList() {
        for(int i=0;i<100;i++){
            ModelClass modelClass=new ModelClass("Delhi");
            list.add(modelClass);
            ModelClass modelClass1=new ModelClass("Karnatka");
            list.add(modelClass1);
            ModelClass modelClass2=new ModelClass("Bangalore");
            list.add(modelClass2);
            ModelClass modelClass3=new ModelClass("Pune");
            list.add(modelClass3);
        }
    }
    private void setRecyclerView() {
        RecyclerViewAdapter recyclerViewAdapter3=new RecyclerViewAdapter(list);
        LinearLayoutManager linearLayoutManager3=new LinearLayoutManager(getContext());
        recyclerView3.setAdapter(recyclerViewAdapter3);
        recyclerView3.setLayoutManager(linearLayoutManager3);

    }
}