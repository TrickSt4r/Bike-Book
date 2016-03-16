package com.example.rit.bikeforrent;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class signUp extends AppCompatActivity {

    private EditText idcardEditText, passEditText;
    private String idcardString, passString;

    public signUp(MainActivity mainActivity, Class<signUp> signUpClass) {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //bindwiget
        bindwiget();

    } //method


    private void bindwiget() {


        idcardEditText = (EditText) findViewById(R.id.editText);
        passEditText = (EditText) findViewById(R.id.editText2);


        //chexkspace

        if (idcardEditText.equals("") || passEditText.equals("")) {
            //have space
            myToast("กรอกมูลไม่ครบ");
        } else {
            //no have space
            checkidcard();



        }
    }

    private void checkidcard() {

        if (idcardString.length()==13) {
            //idture
            confirmData(idcardString, passString);
        } else {
            myToast("รหัสบัตรไม่ถูกต้อง");
        }

    }//checkID

    private void confirmData(String idcardString, String passString) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //wati photo builder.setIcon(R.drawable.);
        builder.setTitle("โปรดตรวจสอบข้อมูล");
        builder.setMessage("รหัสบัตรประชาชน = " + idcardString + "\n" + "password = " + passString);
        builder.setCancelable(false);
        builder.setPositiveButton("confrim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                updateDataToSever();

            }
        });
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }//onclick
        });
        builder.show();

    }//confirmData

    private void updateDataToSever() {


    }

    private void myToast(String strtoast) {
        Toast.makeText(signUp.this, strtoast, Toast.LENGTH_SHORT).show();
    }


    public void onClickSignUp(View view) {
        idcardString = idcardEditText.getText().toString().trim();
        passString = passEditText.getText().toString().trim();
    }

}//main class
