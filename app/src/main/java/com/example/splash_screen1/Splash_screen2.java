 package com.example.splash_screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


 public class Splash_screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent iHome= new Intent(Splash_screen2.this, MainActivity.class);

            startActivity(iHome);
        }
    },4000);


    }
}