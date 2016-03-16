package com.example.rit.bikeforrent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //exelpit
    private EditText idCardEditText, passwordEditText;
    private String idString, passwordString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bindwiget

        bindwiget();


    }//main method

    private void bindwiget() {
        idCardEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);


    }

    public void clicksignMain(View view) {

        idString = idCardEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //check
        if (idString.equals("")||passwordString.equals("")) {

            myAlert("กรุณากรอกข้อมูลให้ครบ");
        }

    }//clicksignMain



    private void myAlert(String strAlert) {

        Toast.makeText(MainActivity.this, strAlert, Toast.LENGTH_SHORT).show();
    }

    public void onclickSignUp (View view) {
        startActivity(new signUp(MainActivity.this, signUp.class));
    }

    private void startActivity(signUp signUp) {


    }
}//main class
