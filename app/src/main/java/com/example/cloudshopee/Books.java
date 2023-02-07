package com.example.cloudshopee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Books extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
    }

    public void launchEdu(View view) {
        Intent Educational = new Intent(this, Educational.class);
        startActivity(Educational);
    }

    public void launchNovel(View view) {
        Intent Novel = new Intent(this, Novel.class);
        startActivity(Novel);
    }

    public void launchDevelopment(View view) {
        Intent Develop = new Intent(this, Development.class);
        startActivity(Develop);
    }
}