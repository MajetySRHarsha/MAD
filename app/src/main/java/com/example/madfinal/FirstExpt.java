package com.example.madfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstExpt extends AppCompatActivity {
    EditText t1,t2;
    Button b1,b2;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_expt);



        b2=findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");

                Toast.makeText(FirstExpt.this, "Values reseted", Toast.LENGTH_SHORT).show();
            }
        });
        b1=findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1 = findViewById(R.id.name1);
                s1 = String.valueOf(t1.getText());

                t2 = findViewById(R.id.password1);
                s2 = String.valueOf(t2.getText());
                if (s1.equals("admin") && s2.equals("admin")) {
                    Intent intent = new Intent(FirstExpt.this, Home.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(FirstExpt.this, "Invalid login" +
                            "" +
                            "" +
                            "", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}