package com.example.madfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    TextView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        String name=null;
        t3=findViewById(R.id.textView2);
        Bundle extras=getIntent().getExtras();
        if(extras!=null){
            name=extras.getString("name");
        }
        t3.setText(name);
    }
}