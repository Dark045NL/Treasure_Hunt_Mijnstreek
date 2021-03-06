package com.example.treasure_hunt_mijnstreek.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.treasure_hunt_mijnstreek.QR_Scanner;
import com.example.treasure_hunt_mijnstreek.R;
import com.example.treasure_hunt_mijnstreek.done_page;
import com.example.treasure_hunt_mijnstreek.homescreen;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Button BtnBarQR = (Button) findViewById(R.id.btn_bar_qr6);
        Button BtnBarHome = (Button) findViewById(R.id.btn_bar_home6);
        Button btnList = (Button) findViewById(R.id.btn_bar_list3);
        BtnBarQR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(QuestionActivity.this, QR_Scanner.class);
                startActivity(int1);
            }
        });

        BtnBarHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(QuestionActivity.this, homescreen.class);
                startActivity(int1);
            }
        });

        btnList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(QuestionActivity.this, done_page.class);
                startActivity(int1);
            }
        });
    }
}