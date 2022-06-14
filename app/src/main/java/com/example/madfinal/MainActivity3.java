package com.example.madfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText t1,t2,t3,t4;
    String s1,s2,s3,s4;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t1=findViewById(R.id.name);
        s1= String.valueOf(t1.getText());
        t2=findViewById(R.id.email);
        s2= String.valueOf(t2.getText());

        t3=findViewById(R.id.phone);
        s3= String.valueOf(t3.getText());

        t4=findViewById(R.id.pwd);
        s4= String.valueOf(t4.getText());

        b=findViewById(R.id.register);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2)&& TextUtils.isEmpty(s3)&& TextUtils.isEmpty(s4)){
                    Toast.makeText(MainActivity3.this, "Please fill all the boxes", Toast.LENGTH_SHORT).show();
                }
                else
                Toast.makeText(MainActivity3.this, "Registered Succesfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}