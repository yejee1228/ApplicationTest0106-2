package com.example.application;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        final Context ctx = CalculatorActivity.this;
        final EditText editText = findViewById(R.id.etext);
        final TextView textView = findViewById(R.id.result);
        class Calc{
            int num1, num2, result;
            String op;
            public void execute(){}
            int getNum1(){return num1;}
            void setNum1(int num1){this.num1 = num1;}
            int getNum2(){return num2;}
            void setNum2(int num2){this.num2 = num2;}
            int getResult(){return result;}
            void setResult(int result){this.result=result;}
            String getOp(){return op;}
            void setOp(String op){this.op=op;}
        }//이너클래스
        final Calc c = new Calc();
        findViewById(R.id.btn_plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.setNum1(Integer.parseInt(editText.getText().toString()));
                c.setOp("+");
                Log.d("입력된 숫자>>", c.getNum1()+"");
                Toast.makeText(ctx, c.getNum1()+"", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "마이너스 클릭", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_multi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "곱하기클릭", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_div).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "나누기클릭", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_equl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.setNum2(Integer.parseInt(editText.getText().toString()));
                switch(c.getOp()){
                    case "+":
                        c.setResult(c.getNum1()+c.getNum2());
                        break;
                }
                textView.setText(c.getResult()+"");
            }
        });
    }
}
