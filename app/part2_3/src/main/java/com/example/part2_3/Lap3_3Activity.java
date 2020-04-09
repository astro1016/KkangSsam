package com.example.part2_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lap3_3Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn_visible;
    Button btn_invisible;
    TextView btn_visible_target;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lap3_3);

        btn_visible = findViewById(R.id.btn_visible);
        btn_invisible = findViewById(R.id.btn_invisible);
        btn_visible_target = findViewById(R.id.btn_visible_target);

        btn_visible.setOnClickListener(this);
        btn_invisible.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btn_visible) {
            btn_visible_target.setVisibility(View.VISIBLE);
        } else if (v == btn_invisible) {
            btn_visible_target.setVisibility(View.INVISIBLE);
        }

    }
}
