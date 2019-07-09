package com.example.androidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        TextView jokeview = (TextView) findViewById(R.id.joke_text);

        String joke = null;
        Intent intent = getIntent();
        joke = intent.getStringExtra("joke");

        if (joke != null){
            jokeview.setText(joke);
        }else {
            jokeview.setText("you joke dealer failed to deliver us a joke");
        }
    }
}
