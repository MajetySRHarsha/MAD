package com.example.madfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String fruits[]={"apple","banana","pitch","jackfruit","water melon"};;
        ListView listView=(ListView)findViewById(R.id.listview);

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,fruits);
        listView.setAdapter(arrayAdapter);
    }
}