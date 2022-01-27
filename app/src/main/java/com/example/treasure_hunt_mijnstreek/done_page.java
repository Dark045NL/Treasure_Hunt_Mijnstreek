package com.example.treasure_hunt_mijnstreek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class done_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done_page);

        Button BtnBarQR = (Button) findViewById(R.id.btn_bar_qr1);
        Button BtnBarHome = (Button) findViewById(R.id.btn_bar_home1);
        BtnBarHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(done_page.this, homescreen.class);
                startActivity(int1);
            }
        });

        BtnBarQR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(done_page.this, QR_Scanner.class);
                startActivity(int1);
            }
        });
    }
}