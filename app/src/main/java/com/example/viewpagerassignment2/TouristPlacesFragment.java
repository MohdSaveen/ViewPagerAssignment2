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
import android.widget.Adapter;

import java.util.ArrayList;

public class TouristPlacesFragment extends Fragment {

    private ArrayList<ModelClass> list=new ArrayList<>();
    private RecyclerView recyclerView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tourist_places, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildList();
        setRecyclerView();
    }

    private void initViews(View view) {
        recyclerView2=view.findViewById(R.id.touristRecyclerView);
    }

    private void buildList() {
        for(int i=0;i<100;i++){
            ModelClass modelClass=new ModelClass("India Gate");
            list.add(modelClass);
            ModelClass modelClass1=new ModelClass("Zoo");
            list.add(modelClass1);
            ModelClass modelClass2=new ModelClass("WaterPark");
            list.add(modelClass2);
            ModelClass modelClass3=new ModelClass("Jama Masjid");
            list.add(modelClass3);

        }
    }
    private void setRecyclerView() {

        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(list);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.setAdapter(recyclerViewAdapter);
    }
}