package com.demogather.methodusedemo.activity.eventBus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.demogather.methodusedemo.R;

import org.greenrobot.eventbus.EventBus;

public class TwoTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_two);


        findViewById(R.id.btn_event_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventMessage message = new EventMessage();
                message.setMessage("啦啦啦啦啦啦啦啦");
                EventBus.getDefault().post(message);
                finish();
            }
        });

    }



}
