package com.newtechieblog.wordpress.views.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        userName = findViewById(R.id.textViewName);

        Intent intent = getIntent();
        String name = intent.getStringExtra("keyword");
        userName.setText(name);
    }
}