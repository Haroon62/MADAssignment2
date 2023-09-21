package com.example.madassignment2.QuestionN02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.madassignment2.R;

public class SplashScreen extends AppCompatActivity {
    ImageView imageView;
    Animation fadeInAnimation;
    Animation fadeOutAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView=findViewById(R.id.splashimage);


        fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadeOutAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out);

        fadeInAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(fadeOutAnimation);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageView.startAnimation(fadeInAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(SplashScreen.this, SignUp.class);
                startActivity(intent)   ;
                finish();
            }
        },3000);


    }
}