package com.example.se1319_pe01_prm391_se130449_vanthanhphuongdat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToOpenProvider(View view) {
        Intent intent = new Intent(this, OwnContentActivity.class);
        startActivity(intent);
    }
}