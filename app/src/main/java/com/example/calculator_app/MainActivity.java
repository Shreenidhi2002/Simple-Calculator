package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5;
EditText et1,et2,et3;
String s1,s2,show;
float a,b,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.btnadd);
        b2=(Button) findViewById(R.id.btnsub);
        b3=(Button) findViewById(R.id.btnmul);
        b4=(Button) findViewById(R.id.btndiv);
        b5=(Button) findViewById(R.id.btnclr);
        et1=(EditText) findViewById(R.id.etfirstno);
        et2=(EditText) findViewById(R.id.etsecondno);
        et3=(EditText) findViewById(R.id.etres);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=et1.getText().toString();
                s2=et2.getText().toString();
                a=Float.parseFloat(s1);
                b=Float.parseFloat(s2);
              res=a+b;
              show=Float.toString(res);
              et3.setText(show);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=et1.getText().toString();
                s2=et2.getText().toString();
                a=Float.parseFloat(s1);
                b=Float.parseFloat(s2);
                res=a-b;
                show=Float.toString(res);
                et3.setText(show);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=et1.getText().toString();
                s2=et2.getText().toString();
                a=Float.parseFloat(s1);
                b=Float.parseFloat(s2);
                res=a*b;
                show=Float.toString(res);
                et3.setText(show);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=et1.getText().toString();
                s2=et2.getText().toString();
                a=Float.parseFloat(s1);
                b=Float.parseFloat(s2);
                res=a/b;
                show=Float.toString(res);
                et3.setText(show);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                et1.setText("");
                et2.setText("");
                et3.setText("");
                et1.requestFocus();
            }
        });
    }
}