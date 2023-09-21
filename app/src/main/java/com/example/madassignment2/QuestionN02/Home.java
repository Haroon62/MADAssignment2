package com.example.madassignment2.QuestionN02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.madassignment2.QuestionNo3.Age;
import com.example.madassignment2.QuestionNo3.Area;
import com.example.madassignment2.QuestionNo3.BMI;
import com.example.madassignment2.QuestionNo3.Currency;
import com.example.madassignment2.QuestionNo3.Friendship;
import com.example.madassignment2.QuestionNo3.Temprature;
import com.example.madassignment2.QuestionNo3.Time;
import com.example.madassignment2.QuestionNo3.Valume;
import com.example.madassignment2.QuestionNo3.WeightAndMass;
import com.example.madassignment2.R;

public class Home extends AppCompatActivity {

    CardView  friend, currency,temp,bmi,length,time,age,weight, volume,area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        friend=findViewById(R.id.friendship);
        currency =findViewById(R.id.currency);
        temp=findViewById(R.id.TemperatureConverter);
        bmi=findViewById(R.id.bmi);
        length=findViewById(R.id.length);
        time=findViewById(R.id.timeconverte);
        age=findViewById(R.id.age);
        weight=findViewById(R.id.weightandmas);
        volume =findViewById(R.id.valume);
        area=findViewById(R.id.areaonverter);

        friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this, Friendship.class);
                startActivity(intent);
            }
        });
        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Home.this, Currency.class);
                startActivity(intent1);
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Home.this, Area.class);
                startActivity(intent2);
            }
        });
        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(Home.this, Age.class);
                startActivity(intent3);
            }
        });
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(Home.this, BMI.class);
                startActivity(intent4);
            }
        });
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(Home.this, com.example.madassignment2.QuestionNo3.length.class);
                startActivity(intent5);
            }
        });
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(Home.this, Temprature.class);
                startActivity(intent6);
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(Home.this, Time.class);
                startActivity(intent7);
            }
        });
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(Home.this, Valume.class);
                startActivity(intent8);
            }
        });
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9=new Intent(Home.this, WeightAndMass.class);
                startActivity(intent9);
            }
        });





    }
}