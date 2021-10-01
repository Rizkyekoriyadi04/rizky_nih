
package com.example.rizkynih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.rizkynih.eko1;
import com.example.rizkynih.eko2;
import com.example.rizkynih.eko3;
import com.example.rizkynih.eko4;
import com.example.rizkynih.eko5;
import com.example.rizkynih.eko6;

public class MainActivity extends AppCompatActivity {

    ImageView ivchicken, ivcrocodile, ivfrog, ivhippo, ivlion, ivowl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivchicken = findViewById(R.id.iv_chicken);
        ivchicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, eko1.class);
                startActivity(intent);
            }
        });

        ivcrocodile = findViewById(R.id.iv_crocodile);
        ivcrocodile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, eko2.class);
                startActivity(intent);
            }
        });

        ivfrog = findViewById(R.id.iv_frog);
        ivfrog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, eko3.class);
                startActivity(intent);
            }
        });

        ivhippo = findViewById(R.id.iv_hippo);
        ivhippo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, eko4.class);
                startActivity(intent);
            }
        });

        ivlion = findViewById(R.id.iv_lion);
        ivlion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, eko5.class);
                startActivity(intent);
            }
        });

        ivowl = findViewById(R.id.iv_owl);
        ivowl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, eko6.class);
                startActivity(intent);
            }
        });
    }