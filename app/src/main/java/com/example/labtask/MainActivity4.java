package com.example.labtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity4 extends AppCompatActivity {
    String[] data = {"Shoes","Wallets","Clothes","Watches","Accessories","Ready To Wear"};
    ListView l ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        l = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.single_row,R.id.textView2,data);
        l.setAdapter(adapter);

    }
}