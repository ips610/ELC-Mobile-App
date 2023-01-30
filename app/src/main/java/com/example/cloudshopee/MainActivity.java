package com.example.cloudshopee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
//Importing Intent Package
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    int grocery_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchMainActivity2(View view) {
        Intent Categories = new Intent(this, Categories.class);
        startActivity(Categories);
    }
}