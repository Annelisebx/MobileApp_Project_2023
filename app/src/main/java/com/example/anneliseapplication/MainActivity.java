package com.example.anneliseapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.anneliseapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainViewModel viewModel = new MainViewModel(this);
        binding.setCount(count);
        binding.setActivity(this);
    }

    public void increment() {
        count++;

        ActivityMainBinding binding = DataBindingUtil.getBinding(findViewById(android.R.id.content));
        if (binding != null) {
            binding.setCount(count);
        }
    }

    public void decrement() {
        if (count > 0) {
            count--;
        }

        ActivityMainBinding binding = DataBindingUtil.getBinding(findViewById(android.R.id.content));
        if (binding != null) {
            binding.setCount(count);
        }
    }

}