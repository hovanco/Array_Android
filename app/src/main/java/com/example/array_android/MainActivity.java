package com.example.array_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] cars = new String[]{"Volvo", "BMW", "Ford", "Mazda"};
        LinearLayout mainLinear = findViewById(R.id.main_linear);
        for (int i = 0; i < cars.length; i++) {

//          Make TextView
            TextView tv = new TextView(MainActivity.this);
            tv.setText("" + cars[i]);

//          Make Button
            Button btn = new Button(MainActivity.this);
            btn.setText("+");

//          make linear horizontal
            LinearLayout subLinear = new LinearLayout(MainActivity.this);
            subLinear.setOrientation(LinearLayout.HORIZONTAL);

//          Make Button to the left


//          add Button and  TextView
            subLinear.addView(tv);
            subLinear.addView(btn);

            mainLinear.addView(subLinear);
            LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    1.0f
            );
            tv.setLayoutParams(param);
        }
    }
}
