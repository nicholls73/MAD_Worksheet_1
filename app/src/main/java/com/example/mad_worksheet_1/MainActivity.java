package com.example.mad_worksheet_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputOne;
    private EditText inputTwo;
    private Button plusButton;
    private Button minusButton;
    private Button multiplyButton;
    private Button divideButton;
    private TextView outputResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputOne = (EditText) findViewById(R.id.inputOne);
        inputTwo = (EditText) findViewById(R.id.inputTwo);

        plusButton = (Button) findViewById(R.id.plusButton);
        minusButton = (Button) findViewById(R.id.minusButton);
        multiplyButton = (Button) findViewById(R.id.multiplyButton);
        divideButton = (Button) findViewById(R.id.divideButton);

        outputResult = (TextView) findViewById(R.id.outputResult);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double operandOne = Double.parseDouble(inputOne.getText().toString());
                double operandTwo = Double.parseDouble(inputTwo.getText().toString());

                double result = operandOne + operandTwo;
                outputResult.setText(Double.toString(result));
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double operandOne = Double.parseDouble(inputOne.getText().toString());
                double operandTwo = Double.parseDouble(inputTwo.getText().toString());

                double result = operandOne - operandTwo;
                outputResult.setText(Double.toString(result));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double operandOne = Double.parseDouble(inputOne.getText().toString());
                double operandTwo = Double.parseDouble(inputTwo.getText().toString());

                double result = operandOne * operandTwo;
                outputResult.setText(Double.toString(result));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double operandOne = Double.parseDouble(inputOne.getText().toString());
                double operandTwo = Double.parseDouble(inputTwo.getText().toString());

                double result = operandOne / operandTwo;
                outputResult.setText(Double.toString(result));
            }
        });
    }
}