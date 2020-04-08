package com.example.part2;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lap3_3 extends AppCompatActivity implements OnClickListener {

    Button trueButton;
    Button falseButton;
    TextView targetTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lap3_3);

        trueButton = findViewById(R.id.btn_visible_true);
        falseButton = findViewById(R.id.btn_visible_false);
        targetTextView = findViewById(R.id.text_visible_target);

        trueButton.setOnClickListener(this);
        falseButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==trueButton) {
            targetTextView.setVisibility(View.VISIBLE);
        } else if (v==falseButton) {
            targetTextView.setVisibility(View.INVISIBLE);
        }


    }
}
