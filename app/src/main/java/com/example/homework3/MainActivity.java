package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private PersonAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> names = new ArrayList<>();
        names.add("Артём");
        names.add("Эржан");
        names.add("Сагыналы");
        names.add("Уларбек");
        names.add("Бекжан");
        names.add("Зафар");
        adapter = new PersonAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}