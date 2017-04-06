package com.example.ideal.animation_fade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick1(View view) {
        /* Create an intent that will start the main activity. */
        Intent mainIntent = new Intent(MainActivity.this, Second_Activity.class);

        //mainIntent.putExtra("id", "1");

        startActivity(mainIntent);

        MainActivity.this.finish();

        overridePendingTransition(R.anim.mainfadein, R.anim.splashfadeout);


    }
}