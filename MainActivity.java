package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNumber1;
    EditText etNumber2;
    TextView txtResult;
    String op;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        txtResult = findViewById(R.id.txtResult);

    }
    public void clickBtnEquals(View view){

        float n1 = Float.parseFloat(etNumber1.getText().toString());
        float n2 = Float.parseFloat(etNumber2.getText().toString());

        if(op.equals("+")){
            float result = n1 + n2;
            txtResult.setText("" + result);
        }else if(op.equals("-")){
            float result = n1 - n2;
            txtResult.setText("" + result);
        }else if(op.equals("*")){
            float result = n1 * n2;
            txtResult.setText("" + result);
        }else if(op.equals("/")){
            float result = n1 / n2;
            txtResult.setText("" + result);
        }


    }

    public void clickBtnOp(View view){
        Button btn = (Button) view;
        op = btn.getText().toString();
    }


    public void openCalc2(View view) {
        Intent it = new Intent(this, MainActivity2.class);
        startActivity(it);
    }
}