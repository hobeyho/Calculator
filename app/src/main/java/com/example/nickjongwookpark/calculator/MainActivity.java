package com.example.nickjongwookpark.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPlus, btnMinus, btnMultiply, btnDivide;
    EditText editTextNum1, editTextNum2;
    TextView textViewAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        editTextNum1 = (EditText) findViewById(R.id.editTextNum1);
        editTextNum2 = (EditText) findViewById(R.id.editTextNum2);
        textViewAnswer = (TextView) findViewById(R.id.textViewAnswer);

        btnPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String n1 = editTextNum1.getText().toString();
                int num1 = Integer.parseInt(n1);
                String n2 = editTextNum2.getText().toString();
                int num2 = Integer.parseInt(n2);
                plus(num1, num2);
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String n1 = editTextNum1.getText().toString();
                int num1 = Integer.parseInt(n1);
                String n2 = editTextNum2.getText().toString();
                int num2 = Integer.parseInt(n2);
                minus(num1, num2);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String n1 = editTextNum1.getText().toString();
                int num1 = Integer.parseInt(n1);
                String n2 = editTextNum2.getText().toString();
                int num2 = Integer.parseInt(n2);
                multiply(num1, num2);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String n1 = editTextNum1.getText().toString();
                int num1 = Integer.parseInt(n1);
                String n2 = editTextNum2.getText().toString();
                int num2 = Integer.parseInt(n2);
                divide(num1, num2);
            }
        });
    }

    public void plus(int num1, int num2){
        int answer = num1 + num2;
        showAnswer(answer);
    }

    public void minus(int num1, int num2){
        int answer = num1 - num2;
        showAnswer(answer);
    }

    public void multiply(int num1, int num2){
        int answer = num1 * num2;
        showAnswer(answer);
    }

    public void divide(int num1, int num2){
        int answer = num1 / num2;
        showAnswer(answer);
    }

    public void showAnswer(int answer){
        textViewAnswer.setText("" + answer);
    }
}
