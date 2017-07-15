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
                startActivity(new Intent(ActivityMethodActivity.this,ActivityMethodTwoActivity.class));
            }
        });

    }



    public static ActivityMethodActivity instance = null;

    private void init() {
        instance = this;
    }

    public void method(){
        Toast.makeText(ActivityMethodActivity.this,"activity调用了activity的方法",Toast.LENGTH_SHORT).show();
    }

}
