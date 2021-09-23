package com.example.viewpagerassignment2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public RecyclerViewViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);

    }

    private void initViews(View itemView) {
        textView=itemView.findViewById(R.id.textView);
    }

    public void setTextView(ModelClass modelClass){
        textView.setText(modelClass.getString());
    }

}
