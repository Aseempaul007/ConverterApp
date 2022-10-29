package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText;
        Button button;
        TextView textView;

        editText =  findViewById(R.id.et1);
        button = findViewById(R.id.btn1);
        textView = findViewById(R.id.tv1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(kiloGramToGram(editText.getText().toString()));
            }
        });
    }


    public String kiloGramToGram(String s){

        double val = Double.parseDouble(s);
        val=val*1000;
        String str = String.valueOf(val);
        return str;
    }
}