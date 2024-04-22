package com.example.tinhtongintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BaiTapTuan3 extends AppCompatActivity {
    ListView lv3;
    Baittap32Adapter adapter;
    ArrayList<Bt32> ls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lv3 = findViewById(R.id.listviewt3);
        ls.add(new Bt32("Nguyen Le A","55",R.drawable.ic_launcher_background));
        ls.add(new Bt32("Tran Van B","43",R.drawable.ic_launcher_background));
        ls.add(new Bt32("Tran Tuan C","32",R.drawable.ic_launcher_background));
        ls.add(new Bt32("Michael D","12",R.drawable.ic_launcher_background));
        ls.add(new Bt32("Nguyen Van E","80",R.drawable.ic_launcher_background));
        ls.add(new Bt32("Le Huy F","61",R.drawable.ic_launcher_background));
        adapter = new Baittap32Adapter(ls, this);
        lv3.setAdapter(adapter);
    }
}