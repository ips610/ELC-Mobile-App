package com.example.cloudshopee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
//Importing Intent Package
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchMainActivity2(View view) {
        Intent ShoppingList = new Intent(this, MainActivity2.class);
        startActivity(ShoppingList);
    }
}