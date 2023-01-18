package com.example.cloudshopee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void launchGrocery(View view) {
        Intent Grocery = new Intent(this, Grocery.class);
        startActivity(Grocery);
    }
    public void launchBooks(View view) {
        Intent Books = new Intent(this, Books.class);
        startActivity(Books);
    }
    public void launchElectronics(View view) {
        Intent Electronics = new Intent(this, Electronics.class);
        startActivity(Electronics);
    }


    public void launchMedicines(View view) {
        Intent Medicines = new Intent(this, Medicines.class);
        startActivity(Medicines);
    }
}