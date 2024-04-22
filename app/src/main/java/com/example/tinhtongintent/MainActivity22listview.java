package com.example.tinhtongintent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity22listview extends AppCompatActivity {

    ListView list;
    @SuppressLint("MissingInflateId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity22listview);
        list = findViewById(R.id.lv);
        String[] arr = new String[]{"1","2","3","4","5","6"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        list.setAdapter(adapter);
    }
}