package com.example.tinhtongintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText s1, s2;
        Button cbutton;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = findViewById(R.id.so1);
        s2 = findViewById(R.id.so2);
        cbutton = findViewById(R.id.calbutton);

        cbutton.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra("so1", s1.getText().toString());
            i.putExtra("so2", s2.getText().toString());
            startActivity(i);
        });
    }
}