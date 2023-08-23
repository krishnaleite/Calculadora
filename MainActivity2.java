package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String strN1 = "";

    String strN2 = "";
    TextView txtResult2;
    String op2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtResult2 = findViewById(R.id.txtResult2);

    }

    public void clickNumbers(View view) {
        Button btn = (Button) view;
        String number = btn.getText().toString();

        if(op2.equals("")){
            strN1 = strN1 + number;
            txtResult2.setText(strN1);
        }else{
            strN2 = strN2 + number;
            txtResult2.setText(strN2);
        }
    }

    public void clickBtnEquals2(View view){

        float n1 = Float.parseFloat(strN1);
        float n2 = Float.parseFloat(strN2);

        if(op2.equals("+")){
            float result = n1 + n2;
            txtResult2.setText("" + result);
        }else if(op2.equals("-")){
            float result = n1 - n2;
            txtResult2.setText("" + result);
        }else if(op2.equals("*")){
            float result = n1 * n2;
            txtResult2.setText("" + result);
        }else if(op2.equals("/")){
            float result = n1 / n2;
            txtResult2.setText("" + result);
        }
    }

    public void clickBtnDot(View view){

        if(op2.equals("")){
            strN1 = strN1 + ".";
            txtResult2.setText(strN1);
        }else{
            strN2 = strN2 + ".";
            txtResult2.setText(strN2);
        }

    }

    public void clickBtnClear(View view){
        strN1 = "";
        strN2 = "";
        op2 = "";
        txtResult2.setText("0.00");
    }

    public void clickBtnDell(View view){
        TextView txtResult2 = findViewById(R.id.txtResult2);
        String textDell = txtResult2.getText().toString();
        String textDell2 = textDell.substring(0, textDell.length() - 1);
        txtResult2.setText(textDell2);
    }


    public void clickBtnOp2(View view){
        Button btn = (Button) view;
        op2 = btn.getText().toString();



    }
}
