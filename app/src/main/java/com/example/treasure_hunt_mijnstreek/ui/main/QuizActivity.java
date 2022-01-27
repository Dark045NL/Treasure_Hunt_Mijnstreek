package com.example.treasure_hunt_mijnstreek.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.treasure_hunt_mijnstreek.R;
import com.example.treasure_hunt_mijnstreek.done_page;
import com.example.treasure_hunt_mijnstreek.homescreen;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button BtnBarList = (Button) findViewById(R.id.btn_bar_list3);
        Button BtnBarHome = (Button) findViewById(R.id.btn_bar_home2);
        Button BtnStartQuiz = (Button) findViewById(R.id.btn_start_quiz);
        BtnStartQuiz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(QuizActivity.this, QuestionActivity.class);
                startActivity(int1);
            }
        });

        BtnBarHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(QuizActivity.this, homescreen.class);
                startActivity(int1);
            }
        });

        BtnBarList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(QuizActivity.this, done_page.class);
                startActivity(int1);
            }
        });
    }
}