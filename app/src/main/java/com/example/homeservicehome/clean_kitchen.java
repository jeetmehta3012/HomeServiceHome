package com.example.homeservicehome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class clean_kitchen extends AppCompatActivity {
    Button kadd;
    TextView cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_kitchen);

        kadd = findViewById(R.id.kitchen_cart);
        kadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(clean_kitchen.this,Finalcart.class);
                startActivity(intent);
            }
        });

        cart = findViewById(R.id.viewcart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(clean_kitchen.this,Finalcart.class);
                startActivity(intent);
            }
        });
    }
}