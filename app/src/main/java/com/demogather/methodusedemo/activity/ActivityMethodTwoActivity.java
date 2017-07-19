package com.demogather.methodusedemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.demogather.methodusedemo.R;

public class ActivityMethodTwoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_activity_method_activity_two;
    private Button btn_activity_method_activity_two2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_two);

        initView();
    }

    private void initView(){
        btn_activity_method_activity_two = (Button) findViewById(R.id.btn_activity_method_activity_two);
        btn_activity_method_activity_two.setOnClickListener(this);

        btn_activity_method_activity_two2 = (Button) findViewById(R.id.btn_activity_method_activity_two2);
        btn_activity_method_activity_two2.setOnClickListener(this);

        boolean isShow = getIntent().getBooleanExtra("isShowFirst",false);
        if(isShow){
            btn_activity_method_activity_two.setVisibility(View.VISIBLE);
            btn_activity_method_activity_two2.setVisibility(View.GONE);
        }else {
            btn_activity_method_activity_two.setVisibility(View.GONE);
            btn_activity_method_activity_two2.setVisibility(View.VISIBLE);
        }

    }

    private void click(){
        ActivityMethodActivity.instance.method();
    }

    private void click2(){
        Intent intent = new Intent();
        intent.putExtra("back","返回了......");
        setResult(1,intent);
        finish();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_activity_method_activity_two:
                click();
                break;
            case R.id.btn_activity_method_activity_two2:
                click2();
                break;
        }

    }
}
