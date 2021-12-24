package com.example.homework3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
private TextView name;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
    }

    public void onBind(String name){
    this.name.setText(name);
    }
}

