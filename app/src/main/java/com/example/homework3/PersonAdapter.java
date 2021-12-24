package com.example.homework3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    private ArrayList<String> namePerson = new ArrayList<>();

    public PersonAdapter(ArrayList<String> namePerson) {
        this.namePerson = namePerson;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.onBind(namePerson.get(position));
    }

    @Override
    public int getItemCount() {
        return namePerson.size();
    }
}
