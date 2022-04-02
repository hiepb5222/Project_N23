package com.example.Project_Nhom23.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.Project_Nhom23.MainActivity;
import com.example.Project_Nhom23.SighInActivity;

import com.example.kiemtra.R;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextLg,editTextPw;
    private Button buttonLg;
    private TextView signuptv;
    private String Username ="admin";
    private String Password ="1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonLg = findViewById(R.id.buttonLogin);
        editTextLg = findViewById(R.id.editTextTextEmailAddress);
        editTextPw = findViewById(R.id.editTextTextPassword);
        signuptv=findViewById(R.id.signuptv);
        eventLogin();
        eventSignup();
    }
    public void eventSignup(){
        signuptv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(LoginActivity.this, SighInActivity.class);
                startActivity(i);
            }
        });
    }
    public void eventLogin(){
        buttonLg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailLg = editTextLg.getText().toString();
                String PassWordLg = editTextPw.getText().toString();
                if (CheckMailPass(emailLg,PassWordLg)){
                    Intent intent_login=new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent_login);
                }


            }
        });
    }

    public boolean CheckMailPass(String name , String password){
        if(name.equals(Username) && password.equals(Password)){
            return true;
        }
        return false;
    }
}