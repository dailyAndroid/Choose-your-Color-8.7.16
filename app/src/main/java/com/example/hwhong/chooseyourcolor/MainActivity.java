package com.example.hwhong.chooseyourcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button red,orange,yellow,green,blue,purple,black;
    TextView colorFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = (Button) findViewById(R.id.red);
        red.setOnClickListener(this);
        orange = (Button) findViewById(R.id.orange);
        orange.setOnClickListener(this);
        yellow = (Button) findViewById(R.id.yellow);
        yellow.setOnClickListener(this);
        green = (Button) findViewById(R.id.green);
        green.setOnClickListener(this);
        blue = (Button) findViewById(R.id.blue);
        blue.setOnClickListener(this);
        purple = (Button) findViewById(R.id.purple);
        purple.setOnClickListener(this);
        black = (Button) findViewById(R.id.black);
        black.setOnClickListener(this);

        colorFrame = (TextView) findViewById(R.id.colorFrame);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.red:
                colorFrame.setBackgroundColor(Color.parseColor("#ff0000"));
                break;
            case R.id.orange:
                colorFrame.setBackgroundColor(Color.parseColor("#ffa500"));
                break;
            case R.id.yellow:
                colorFrame.setBackgroundColor(Color.parseColor("#FFFF00"));
                break;
            case R.id.green:
                colorFrame.setBackgroundColor(Color.parseColor("#00ff00"));
                break;
            case R.id.blue:
                colorFrame.setBackgroundColor(Color.parseColor("#0000FF"));
                break;
            case R.id.purple:
                colorFrame.setBackgroundColor(Color.parseColor("#EE82EE"));
                break;
            case R.id.black:
                colorFrame.setBackgroundColor(Color.parseColor("#000000"));
                break;
        }
    }
}
