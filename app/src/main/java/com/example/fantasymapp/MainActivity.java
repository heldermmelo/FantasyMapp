package com.example.fantasymapp;

import android.content.Intent;
import android.net.sip.SipErrorCode;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView mImageView;
        mImageView = (ImageView) findViewById(R.id.imageView3);
        mImageView.setImageResource(R.drawable.compassrose);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(getBaseContext(), Opcoes.class);
                startActivity(intent);
            }
                },4000);
        }
        }