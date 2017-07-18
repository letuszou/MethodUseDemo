package com.demogather.methodusedemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.demogather.methodusedemo.R;

import static com.demogather.methodusedemo.R.id.btn_activity_method_activity_two;

public class ActivityMethodTwoActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_two);

        initView();
    }

    private void initView(){
        Button btn_activity_method_activity_two = (Button) findViewById(R.id.btn_activity_method_activity_two);
        btn_activity_method_activity_two.setOnClickListener(this);


    }

    private void click(){
        ActivityMethodActivity.instance.method();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case btn_activity_method_activity_two:
                click();
                break;
        }

    }
}
