package com.example.treasure_hunt_mijnstreek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.treasure_hunt_mijnstreek.ui.main.QuizActivity;

public class homescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen2);


        Button BtnMaps = (Button) findViewById(R.id.btn_maps);
        Button BtnBarQR = (Button) findViewById(R.id.btn_bar_qr);
        Button BtnQR = (Button) findViewById(R.id.btn_qr);
        Button BtnQuiz = (Button) findViewById(R.id.btn_quiz);
        Button BtnBarList = (Button) findViewById(R.id.btn_bar_list);
        Button btnList = (Button) findViewById(R.id.btn_list);
        btnList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(homescreen.this, done_page.class);
                startActivity(int1);
            }
        });

        BtnBarList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(homescreen.this, done_page.class);
                startActivity(int1);
            }
        });

        BtnQuiz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(homescreen.this, QuizActivity.class);
                startActivity(int1);
            }
        });

        BtnQR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(homescreen.this, QR_Scanner.class);
                startActivity(int1);
            }
        });

        BtnBarQR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(homescreen.this, QR_Scanner.class);
                startActivity(int1);
            }
        });

        BtnMaps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(homescreen.this, MapsActivity.class);
                startActivity(int1);
            }
        });
    }


}