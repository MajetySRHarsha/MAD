package com.example.madfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Simple_Calculator extends AppCompatActivity {
    EditText input1,input2;
    TextView res;
    Button b;
    String d1,d2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1=findViewById(R.id.input1);
                input2=findViewById(R.id.input2);

                d1=String.valueOf(input1.getText());
                d2=String.valueOf(input2.getText());

                int n1=Integer.parseInt(d1);
                int n2=Integer.parseInt(d2);
                res.setText("Addition");

            }
        });
    }
}