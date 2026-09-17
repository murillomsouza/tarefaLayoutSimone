package com.example.tarefalayoutsimone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;

import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    int[] movies = {

            R.drawable.morango_2,

            R.drawable.morango_choco,

            R.drawable.morango_preto

    };

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerMovies);

        recyclerView.setLayoutManager(

                new LinearLayoutManager(this,

                        LinearLayoutManager.HORIZONTAL,

                        false)

        );

        MorangoAdapter adapter = new MorangoAdapter(this, morango);

        recyclerView.setAdapter(adapter);

    }

}