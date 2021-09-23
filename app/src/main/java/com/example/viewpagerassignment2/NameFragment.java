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


public class NameFragment extends Fragment {

    private ArrayList<ModelClass> list=new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_name, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.nameRecyclerView);
        buildList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(list);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private void buildList() {
        for(int i=0;i<100;i++){
            ModelClass modelClass=new ModelClass("Ram");
            list.add(modelClass);
            ModelClass modelClass1=new ModelClass("Sita");
            list.add(modelClass1);
            ModelClass modelClass2=new ModelClass("Laxman");
            list.add(modelClass2);
            ModelClass modelClass3=new ModelClass("Laxami");
            list.add(modelClass3);

        }
    }
}