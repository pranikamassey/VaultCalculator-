package com.example.chato.calculatorproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView screen;
    private int c,d;
    private String str1, str2, str3, result, str, sign;
    private double a, b;
    // FragmentVault fragmentVault;
    // FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (TextView) findViewById(R.id.textView);
        str = "";

      //    fragmentVault=new FragmentVault();
      //   fragmentManager =getSupportFragmentManager();

    }

    public void onClick(View v) {
        Button button = (Button) v;
        str += button.getText().toString();
        screen.setText(str);

        str1 = str;
      //  a = Double.parseDouble(str);
        c= Integer.parseInt(str);

    }

    public void onClickSign(View v) {
        Button button = (Button) v;
        sign = button.getText().toString();
        screen.setText(sign);
        Log.d("TAG", "onClickSign: ");
        str = "";
    }

    public void calculate(View v) {

        Button button = (Button) v;
        str2 = screen.getText().toString();
        //b = Double.parseDouble(str2);
        d=Integer.parseInt(str2);
        if (c == 1234) {
            if (d == 1234) {
               screen.setText("password");
                startActivity(new Intent(MainActivity.this, OtherActivity.class));

            }
        } else {

            if (sign.equals("+")) {
                result = c + d + "";
            } else if (sign.equals("-")) {
                result = c - d + "";
            } else if (sign.equals("*")) {
                result = c * d + "";
            } else if (sign.equals("/")) {
                result = c / d + "";
            }

//        else if (screen.getText() == "00000") {
//            screen.setText("****");
//        }
            else {
                screen.setText("k");
            }
            screen.setText(result);
        }
    }



}