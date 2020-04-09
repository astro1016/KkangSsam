package com.example.part2_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lap3_3_2Activity extends AppCompatActivity {

    Button btn_visible;
    Button btn_invisible;
    TextView btn_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lap3_3_2);

        btn_visible = findViewById(R.id.btn_visible);
        btn_invisible = findViewById(R.id.btn_invisible);
        btn_textView = findViewById(R.id.btn_visible_target);
    }

    public void btn_click(View view) {
        if (view == btn_visible) {
            btn_textView.setVisibility(View.VISIBLE);
        } else if (view == btn_invisible) {
            btn_textView.setVisibility(View.INVISIBLE);
        }

    }
}
