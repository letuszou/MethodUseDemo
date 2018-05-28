package com.demogather.methodusedemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.demogather.methodusedemo.R;
import com.demogather.methodusedemo.activity.eventBus.OneTwoActivity;
import com.demogather.methodusedemo.activity.eventBus.TwoTwoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_main_one_click;
    private Button btn_main_two_click;
    private Button btn_main_three_click;
    private Button btn_event_bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setListener();

    }

    private void initView() {
        btn_main_one_click = (Button) findViewById(R.id.btn_main_one_click);
        btn_main_two_click = (Button) findViewById(R.id.btn_main_two_click);
        btn_main_three_click = (Button) findViewById(R.id.btn_main_three_click);
        btn_event_bus = (Button) findViewById(R.id.btn_event_bus);
    }

    private void setListener() {
        btn_main_one_click.setOnClickListener(this);
        btn_main_two_click.setOnClickListener(this);
        btn_main_three_click.setOnClickListener(this);
        btn_event_bus.setOnClickListener(this);
    }

    private void enterOne() {
        startActivity(new Intent(MainActivity.this, ActivityMethodActivity.class));
    }

    private void enterTwo() {
        startActivity(new Intent(MainActivity.this, ActivityMethodAdapterActivity.class));
    }

    private void enterThree(){
        startActivity(new Intent(MainActivity.this, FragmentMethodActivity.class));
    }

    private void enterFour(){
        startActivity(new Intent(MainActivity.this, OneTwoActivity.class));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_main_one_click:
                enterOne();
                break;
            case R.id.btn_main_two_click:
                enterTwo();
                break;
            case R.id.btn_main_three_click:
                enterThree();
                break;
            case R.id.btn_event_bus:
                enterFour();
                break;
        }

    }


}
