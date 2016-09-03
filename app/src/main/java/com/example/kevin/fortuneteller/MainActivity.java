package com.example.kevin.fortuneteller;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int points = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayFortune(View view){
        TextView displayText = (TextView) findViewById(R.id.displayFortune);
        Resources res = getResources();
        Random rand = new Random();
        int num = rand.nextInt(10);

        displayText.setText(res.getStringArray(R.array.fortunes)[num]);
    }
}
