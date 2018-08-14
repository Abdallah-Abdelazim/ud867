package com.abdallah.jokedisplayer.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import com.abdallah.jokedisplayer.R;

public class JokeDisplayActivity extends AppCompatActivity {

    private static final String TAG = JokeDisplayActivity.class.getSimpleName();

    public static final String EXTRA_JOKE = "com.abdallah.jokedisplayer.EXTRA_JOKE";

    TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        jokeTextView = findViewById(R.id.tv_joke);

        Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_JOKE)) {
            jokeTextView.setText(intent.getStringExtra(EXTRA_JOKE));
        }
        else {
            Log.e(TAG, "No joke was passed as an intent extras");
        }
    }

}
