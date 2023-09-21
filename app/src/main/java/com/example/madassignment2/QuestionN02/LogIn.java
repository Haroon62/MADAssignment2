package com.example.madassignment2.QuestionN02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.madassignment2.R;

public class LogIn extends AppCompatActivity {

    String email1,password;
    EditText email,pass;
    AppCompatButton login,newuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        email=findViewById(R.id.emaail);
        pass=findViewById(R.id.pass);
        login=findViewById(R.id.login);
        newuser=findViewById(R.id.newuser);

        Intent intent = getIntent();
        email1 = intent.getStringExtra("email");
        password = intent.getStringExtra("password");

        Log.d("hsjs", email1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!email1.equals(email.getText().toString())){
                    Toast.makeText(LogIn.this, "Enter same Email", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(pass.getText().toString())) {
                    Toast.makeText(LogIn.this, "Enter same Password", Toast.LENGTH_SHORT).show();
                } else if (email1.equals(email.getText().toString() ) && password.equals(pass.getText().toString())) {
                    Toast.makeText(LogIn.this, "Successfully Login", Toast.LENGTH_SHORT).show();
                    Intent intent1=new Intent(LogIn.this, Home.class);
                    startActivity(intent1);
                    finish();
                }
                else {
                    Toast.makeText(LogIn.this, "Enter Email And Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}