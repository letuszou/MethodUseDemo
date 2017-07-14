package com.demogather.methodusedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_main_one_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setListener();

    }

    private void initView(){
        btn_main_one_click = (Button) findViewById(R.id.btn_main_one_click);
    }

    private void setListener(){
        btn_main_one_click.setOnClickListener(this);
    }

    private void enterOne(){
        startActivity(new Intent(MainActivity.this,ActivityMethodActivity.class));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_main_one_click:
                enterOne();
                break;
        }

    }


}
