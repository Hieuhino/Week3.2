package com.example.tinhtongintent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView kq;
    @Override
    @SuppressLint("MissingInflateId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        kq = findViewById(R.id.ketqua);
        Intent i1 = getIntent();
        String so1t = i1.getExtras().getString("so1");
        String so2t = i1.getExtras().getString("so2");
        float so1 = Float.parseFloat(so1t);
        float so2 = Float.parseFloat(so2t);
        float sum = so1+so2;
        kq.setText(String.valueOf(sum));
    }
}