package com.example.user.mathapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText input1;
    private EditText input2;
    private Button button;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);
        answer = (TextView) findViewById(R.id.answer);

        answer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                compute();
                break;
            case R.id.answer:
                clear();
                break;
            default:
                // Does nothing
        }
    }

    private void compute() {
        String x = input1.getText().toString();
        String y = input2.getText().toString();
        answer.setText(Double.toString(MyMath.add(Double.parseDouble(x), Double.parseDouble(y))));
    }

    private void clear() {
        answer.setText("");
        input1.setText("");
        input2.setText("");
    }
}