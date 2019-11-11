package com.example.apigobierno.vistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.apigobierno.R;

public class MainActivity extends AppCompatActivity {

    private TextView tvMostrar;
    private MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configView();
    }

    public void configView(){
        tvMostrar = findViewById(R.id.tvMostrar);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getLista().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                tvMostrar.setText(s);
            }
        });
    }

    public void buscar(View v){
        mainViewModel.buscarVM("22");
    }
}
