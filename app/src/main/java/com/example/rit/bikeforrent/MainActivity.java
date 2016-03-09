package com.example.rit.bikeforrent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//main method
    public void onclickSignUp (View view) {
        startActivity(new signUp(MainActivity.this, signUp.class));
    }

    private void startActivity(signUp signUp) {


    }
}//main class
