package com.example.madfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class lab_expt7 extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_expt7);

        recyclerView=findViewById(R.id.recyclerview);

        s1=getResources().getStringArray(R.array.user_id);
        s2=getResources().getStringArray(R.array.desc);

        MyAdapter myAdapter=new MyAdapter(this,s1,s2);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}