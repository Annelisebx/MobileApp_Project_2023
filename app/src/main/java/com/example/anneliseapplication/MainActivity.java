package com.example.anneliseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button inc_button;
    Button dec_button;
    Button reset_button;
    TextView count_display;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc_button=findViewById(R.id.inc_button);
        dec_button=findViewById(R.id.dec_button);
        reset_button=findViewById(R.id.reset_button);
        count_display=findViewById(R.id.counter);

        inc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                count_display.setText("" + count);
                toastMsg("Current count: " + count +" Previous Count: " + (count-1));
            }
        });

        dec_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count<=0) count=0;
                else
                    count--;
                count_display.setText("" + count);
                toastMsg("Current count: " + count +" Previous Count: " + (count+1));
            }
        });

        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count_prev = count;
                count=0;

                count_display.setText("" + count);
                toastMsg("Current count: " + count +" Previous Count: " + (count_prev));
            }
        });
    }
    public void toastMsg(String text) {
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
        toast.show();
    }


}