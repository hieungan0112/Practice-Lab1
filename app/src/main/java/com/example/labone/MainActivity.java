package com.example.labone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputA;
    private EditText inputB;
    private Button btCal;
    private TextView myResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputA = (EditText) findViewById(R.id.editTexta);
        inputB = (EditText) findViewById(R.id.editTextb);
        myResult = (TextView) findViewById(R.id.textViewResult);
        btCal = (Button) findViewById(R.id.buttonCal);
        btCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(inputA.getText().toString());
                int b= Integer.parseInt(inputB.getText().toString());
                int area = a*b;
                int perimeter = (a+b)*2;
                myResult.setText("Area: "+area+" Perimeter: "+perimeter);
            }
        });
    }
}