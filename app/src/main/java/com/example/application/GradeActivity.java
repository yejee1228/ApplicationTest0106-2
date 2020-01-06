package com.example.application;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GradeActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        final Context _this = GradeActivity.this;
        final EditText kor = findViewById(R.id.kor);
        final EditText eng = findViewById(R.id.eng);
        final EditText math = findViewById(R.id.math);
        final TextView tv = findViewById(R.id.eval);
        class Eval{
            double kor, eng, math;

            public void setKor(double kor) {
                this.kor = kor;
            }
            double getKor(){return kor;}

            public void setEng(double eng) {
                this.eng = eng;
            }

            public double getEng() {
                return eng;
            }

            public void setMath(double math) {
                this.math = math;
            }

            public double getMath() {
                return math;
            }

        }
        final Eval e = new Eval();
        findViewById(R.id.btn_eval).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e.setKor(Double.parseDouble(kor.getText().toString()));
                e.setEng(Double.parseDouble(eng.getText().toString()));
                e.setMath(Double.parseDouble(math.getText().toString()));
                double result =(e.getKor()+e.getEng()+e.getMath())/3;
                tv.setText(result+"");
            }
        });
    }
}
