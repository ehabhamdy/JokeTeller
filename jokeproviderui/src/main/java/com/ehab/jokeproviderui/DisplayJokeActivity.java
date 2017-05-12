package com.ehab.jokeproviderui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");

        TextView jokeTextView = (TextView) findViewById(R.id.joke_text_view);
        jokeTextView.setText(joke);



    }
}
