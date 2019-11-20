package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView myRecyclerView = findViewById(R.id.myRecyclerView);

        myRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));

        List<JeuVideo> mesJeux = new ArrayList<JeuVideo>();

        for(int i=0; i<100; i++)
        {
            JeuVideo j = new JeuVideo("J"+String.valueOf(i), String.valueOf(i));
            mesJeux.add(j);
        }

        myRecyclerView.setAdapter( new MyVideoGamesAdapter(mesJeux));
    }
}
