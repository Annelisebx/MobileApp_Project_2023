package com.example.anneliseapplication;

import android.content.Context;
import android.widget.Toast;

public class MainViewModel {
    private Context context;

    public MainViewModel(Context context) {
        this.context = context;
    }

    public void showToast() {
        Toast.makeText(context, "Hello, Data Binding!", Toast.LENGTH_SHORT).show();
    }
}