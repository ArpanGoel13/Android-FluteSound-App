package com.example.flutesound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnOne,btnTwo,btnThree,btnFour,btnFive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = findViewById(R.id.btn1);
        btnTwo = findViewById(R.id.btn2);
        btnThree = findViewById(R.id.btn3);
        btnFour = findViewById(R.id.btn4);
        btnFive = findViewById(R.id.btn5);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int clickedBtnId = v.getId();
        if (clickedBtnId == R.id.btn1){
            PlaySound(R.raw.fluteone);
        }
        else if (clickedBtnId == R.id.btn2){
            PlaySound(R.raw.flutetwo);
        }
        else if (clickedBtnId == R.id.btn3){
            PlaySound(R.raw.flutethree);
        }
        else if (clickedBtnId == R.id.btn4){
            PlaySound(R.raw.flutefour);
        }
        else if (clickedBtnId == R.id.btn5){
            PlaySound(R.raw.flutefive);
        }
    }

    public void PlaySound(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),id);
        mediaPlayer.start();
    }
}