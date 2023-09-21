package com.example.madassignment2.QuestionN02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.madassignment2.R;

public class SignUp extends AppCompatActivity {
    EditText name,email,password,confirm;
    AppCompatButton signup,existing;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        confirm=findViewById(R.id.confirm);
        signup=findViewById(R.id.signup);
        existing=findViewById(R.id.existing);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameget=name.getText().toString();
                String emailget=email.getText().toString();
                String passwordget=password.getText().toString();
                String confirmget=confirm.getText().toString();

                if (nameget.isEmpty() && emailget.isEmpty() && passwordget.isEmpty() && confirmget.isEmpty()){
                    Toast.makeText(SignUp.this, "Fil all fields ", Toast.LENGTH_SHORT).show();

                } else if (emailget.isEmpty()) {
                    Toast.makeText(SignUp.this, "Enter Email", Toast.LENGTH_SHORT).show();
                } else if (nameget.isEmpty()) {
                    Toast.makeText(SignUp.this, "Enter Name", Toast.LENGTH_SHORT).show();
                } else if (passwordget.isEmpty()) {
                    Toast.makeText(SignUp.this, "Enter Password", Toast.LENGTH_SHORT).show();
                }else if (confirmget.isEmpty()) {
                    Toast.makeText(SignUp.this, "Enter Confirm Password", Toast.LENGTH_SHORT).show();
                }else if (!confirmget.equals(passwordget)) {
                    Toast.makeText(SignUp.this, "Enter Same Password", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(SignUp.this, LogIn.class);
                    intent.putExtra("email", emailget); // Use a unique key for each value
                    intent.putExtra("password", passwordget); // Use a unique key for each value
                    startActivity(intent);

                }

            }
        });

    }
}