package com.example.thayn.officecars;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.*;
import android.view.View;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handle = new Handler();
        mostrarLogin();
        handle = new Handler();
        handle.postDelayed(new Runnable(){
            @Override
            public void run() {
                mostrarLogin();
            }
        }, 5000);
    }
        //restante do codigo

    private void mostrarLogin() {
        Intent intent = new Intent(com.example.thayn.officecars.SplashScreen.this,
                Login.class);
        StartActivity(intent);
        finish();
    }



    private void StartActivity(Intent intent) {
    }

}
