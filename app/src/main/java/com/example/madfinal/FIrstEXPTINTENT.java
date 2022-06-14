package com.example.madfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FIrstEXPTINTENT extends AppCompatActivity {
    EditText t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_exptintent);

        t4=findViewById(R.id.sairam);
        Button b=findViewById(R.id.jai);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FIrstEXPTINTENT.this,SecondScreen.class);
                intent.putExtra("name",String.valueOf(t4.getText()));
                startActivity(intent);

            }
        });
    }
}