package com.example.anneliseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.touch_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Code here executes on main thread after user presses button
            }
        });

    }
    public void toastMsg(String text) {
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
        toast.show();
    }

    public void displayToastMsg(View view) {
        toastMsg("Toast!!!");
    }

}