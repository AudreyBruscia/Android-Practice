package com.example.user.mathapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 12/13/2015.
 */
public class LauncherActivity extends Activity implements View.OnClickListener{
    private Button addButton;
    private Button subButton;
    private Button multButton;
    private Button divButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(this);
        subButton = (Button) findViewById(R.id.subButton);
        subButton.setOnClickListener(this);
        multButton = (Button) findViewById(R.id.multButton);
        multButton.setOnClickListener(this);
        divButton = (Button) findViewById(R.id.divButton);
        divButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, AddActivity.class);
        switch (v.getId()) {
            case R.id.addButton:
                intent.putExtra("op", 0);
                break;
            case R.id.subButton:
                intent.putExtra("op", 1);
                break;
            case R.id.multButton:
                intent.putExtra("op", 2);
                break;
            case R.id.divButton:
                intent.putExtra("op", 3);
                break;
            default:
        }
        startActivity(intent);
    }
}
