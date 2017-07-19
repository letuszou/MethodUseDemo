package com.demogather.methodusedemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.demogather.methodusedemo.R;

public class ActivityMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method);

        init();

        Button btn_activity_method_activity = (Button) findViewById(R.id.btn_activity_method_activity);
        btn_activity_method_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMethodActivity.this,ActivityMethodTwoActivity.class);
                intent.putExtra("isShowFirst",true);
                startActivity(intent);

            }
        });

        Button btn_activity_method_activity2 = (Button) findViewById(R.id.btn_activity_method_activity2);
        btn_activity_method_activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        click2();
            }
        });

    }

    private void click2(){
        Intent intent = new Intent(ActivityMethodActivity.this,ActivityMethodTwoActivity.class);
        startActivityForResult(intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode ==0 && resultCode ==1){
            method2(data.getStringExtra("back"));
        }
    }

    public static ActivityMethodActivity instance = null;

    private void init() {
        instance = this;
    }

    public void method(){
        Toast.makeText(ActivityMethodActivity.this,"activity调用了activity的方法-用静态对象",Toast.LENGTH_SHORT).show();
    }
    public void method2(String back){
        Toast.makeText(ActivityMethodActivity.this,"activity调用了activity的方法-用回调,数据为："+back,Toast.LENGTH_SHORT).show();
    }

}
