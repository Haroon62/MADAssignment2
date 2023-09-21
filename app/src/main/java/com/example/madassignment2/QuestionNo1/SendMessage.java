package com.example.madassignment2.QuestionNo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.madassignment2.R;

public class SendMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        SMS();
    }
    private void SMS() {
        AppCompatButton button=findViewById(R.id.Send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText phone=findViewById(R.id.phone);
                EditText message=findViewById(R.id.name);

                String ph=phone.getText().toString();
                String sms=message.getText().toString();

                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(ph,null,sms,null,null);
                Toast.makeText(SendMessage.this, "Message send hopefully send", Toast.LENGTH_SHORT).show();
            }
        });
    }
}