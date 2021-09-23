package com.example.viewpagerassignment2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewViewHolder> {

    private ArrayList<ModelClass> list;

    public RecyclerViewAdapter(ArrayList<ModelClass> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new RecyclerViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        ModelClass modelClass=list.get(position);
        holder.setTextView(modelClass);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
