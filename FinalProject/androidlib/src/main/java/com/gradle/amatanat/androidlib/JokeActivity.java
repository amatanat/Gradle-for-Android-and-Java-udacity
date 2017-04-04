package com.gradle.amatanat.androidlib;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


/**
 * Created by amatanat on 04.04.17.
 */

public class JokeActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_main);

        Bundle extras = getIntent().getExtras();
        String joke;

        if (extras != null) {
            joke = extras.getString("joke");
            TextView jokeTextView = (TextView) findViewById(R.id.textview_id);
            jokeTextView.setText(joke);
        }
    }
}
