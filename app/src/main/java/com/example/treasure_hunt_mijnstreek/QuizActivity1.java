package com.example.treasure_hunt_mijnstreek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.treasure_hunt_mijnstreek.ui.main.QuestionActivity;
import com.example.treasure_hunt_mijnstreek.ui.main.QuizActivity;

public class QuizActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        Button BtnBarList = (Button) findViewById(R.id.btn_bar_list6);
        Button BtnBarHome = (Button) findViewById(R.id.btn_bar_home6);
        Button BtnBarQR = (Button) findViewById(R.id.btn_bar_qr6);
        BtnBarQR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(QuizActivity1.this, QR_Scanner.class);
                startActivity(int1);
            }
        });

        BtnBarHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(QuizActivity1.this, homescreen.class);
                startActivity(int1);
            }
        });

        BtnBarList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(QuizActivity1.this, done_page.class);
                startActivity(int1);
            }
        });
    }
}