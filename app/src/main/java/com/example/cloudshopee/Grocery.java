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

    public void showBrush(View view) {
        Intent Brush = new Intent(this, Brush.class);
        startActivity(Brush);
    }

    public void showChips(View view) {
        Intent Chips = new Intent(this, Chips.class);
        startActivity(Chips);
    }

    public void showBiscuits(View view) {
        Intent Biscuits = new Intent(this, Biscuits.class);
        startActivity(Biscuits);
    }

    public void showchocolate(View view) {
        Intent Chocolates = new Intent(this, chocolate.class);
        startActivity(Chocolates);
    }

    public void showSugar(View view) {
        Intent Sugar = new Intent(this, Sugar.class);
        startActivity(Sugar);
    }

    public void showSoap(View view) {
        Intent Soap = new Intent(this, Soap.class);
        startActivity(Soap);
    }

    public void showBread(View view) {
        Intent Bread = new Intent(this, Bread.class);
        startActivity(Bread);
    }

    public void showMaggi(View view) {
        Intent Maggi = new Intent(this, Maggi.class);
        startActivity(Maggi);
    }
}