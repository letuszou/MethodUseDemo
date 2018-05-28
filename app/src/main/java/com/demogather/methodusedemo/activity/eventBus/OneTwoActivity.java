package com.demogather.methodusedemo.activity.eventBus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.demogather.methodusedemo.R;
import com.demogather.methodusedemo.activity.MainActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class OneTwoActivity extends AppCompatActivity {

    private TextView tv_event_bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_two);
        EventBus.getDefault().register(this);
        tv_event_bus = (TextView) findViewById(R.id.tv_event_bus);
        findViewById(R.id.btn_event_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OneTwoActivity.this,TwoTwoActivity.class));
            }
        });

    }

    //订阅方法，当接收到事件的时候，会调用该方法
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(EventMessage messageEvent){
        Toast.makeText(OneTwoActivity.this, "返回的数据为："+messageEvent.getMessage(), Toast.LENGTH_SHORT).show();
        tv_event_bus.setText(messageEvent.getMessage());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

}
