package com.example.user.mathapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText input1;
    private EditText input2;
    private Button button;
    private TextView answer;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int op = getIntent().getIntExtra("op", -1);
        TextView operator = (TextView) findViewById(R.id.operator);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        switch (op) {
            case 0:
                operator.setText("+");
                getSupportActionBar().setTitle("Add");
                break;
            case 1:
                operator.setText("-");
                getSupportActionBar().setTitle("Subtract");
                break;
            case 2:
                operator.setText("*");
                getSupportActionBar().setTitle("Multiply");
                break;
            case 3:
                operator.setText("/");
                getSupportActionBar().setTitle("Divide");
                break;
            default:
        }

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
                /*Intent intent = new Intent(this, SubtractActivity.class);
                startActivity(intent);*/
                break;
            case R.id.answer:
                clear();
                break;
            default:
                // Does nothing
        }
    }

    private void compute() {
        int op = getIntent().getIntExtra("op", -1);
        String x = input1.getText().toString();
        String y = input2.getText().toString();

        switch (op) {
            case 0:
                answer.setText(Double.toString(MyMath.add(Double.parseDouble(x), Double.parseDouble(y))));
                break;
            case 1:
                answer.setText(Double.toString(MyMath.sub(Double.parseDouble(x), Double.parseDouble(y))));
                break;
            case 2:
                answer.setText(Double.toString(MyMath.mul(Double.parseDouble(x), Double.parseDouble(y))));
                break;
            case 3:
                answer.setText(Double.toString(MyMath.div(Double.parseDouble(x), Double.parseDouble(y))));
                break;
            default:
        }
    }

    private void clear() {
        answer.setText("");
        input1.setText("");
        input2.setText("");
    }
}