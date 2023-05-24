package com.example.myquizz2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class categories extends AppCompatActivity{
    Button music;
    Button sport;
    Button logos;
    Button movies;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories_tab);
        music = (Button) findViewById(R.id.music);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(categories.this,music.class);
                startActivity(intent);
            }
        });
        sport = (Button) findViewById(R.id.sports);
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(categories.this, sport.class);
                startActivity(intent1);
            }
        });

        logos = (Button) findViewById(R.id.logos);
        logos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(categories.this, logo.class);
                startActivity(intent2);
            }
        });

        movies = (Button) findViewById(R.id.movies);
        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(categories.this, movies.class);
                startActivity(intent3);
            }
        });
    }


}
