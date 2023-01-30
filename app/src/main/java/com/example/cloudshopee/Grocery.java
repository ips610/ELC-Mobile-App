package com.example.cloudshopee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Grocery extends AppCompatActivity {

    int grocery_count = 0;
    TextView gcart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);
        gcart = findViewById(R.id.G_Cart);
    }

    @SuppressLint("SetTextI18n")
    public void ShowAddToCart(View view) {

        grocery_count++;
        gcart.setText(Integer.toString(grocery_count));

    }

    public void showFlour(View view) {
        Intent Flour = new Intent(this, Flour.class);
        startActivity(Flour);
    }

    public void showPulses(View view) {
        Intent Pulses = new Intent(this, Pulses.class);
        startActivity(Pulses);
    }
}