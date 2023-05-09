package com.example.anneliseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button food_button;
    Button touch_button;
    ImageView iv;
    int[] images ={R.drawable.angry_shiba,R.drawable.calm_shiba};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=(ImageView) findViewById(R.id.angry_shiba);
        touch_button=(Button) findViewById(R.id.touch_button);
        food_button=(Button) findViewById(R.id.food_button);

        touch_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageResource(images[0]);
                toastMsg("Bark :(");
            }
        });

        food_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageResource(images[1]);
                toastMsg("Yummy :)");
            }
        });
    }
    public void toastMsg(String text) {
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
        toast.show();
    }

    public void displayFoodMsg(View view) {
        toastMsg("Yummy :)");
    }

    public void displayTouchMsg(View view) {
        toastMsg("Bark :(");
    }


}