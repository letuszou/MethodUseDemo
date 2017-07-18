package com.demogather.methodusedemo.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.demogather.methodusedemo.R;
import com.demogather.methodusedemo.fragment.ActivityMethodFragment;
import com.demogather.methodusedemo.fragment.ActivityMethodTwoFragment;


public class FragmentMethodActivity extends FragmentActivity implements View.OnClickListener {

    private FrameLayout content;
    private ActivityMethodFragment activityMethodFragment;
    private ActivityMethodTwoFragment activityMethodTwoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_method);
        content = (FrameLayout) findViewById(R.id.content);
        // 设置默认的Fragment
        setDefaultFragment();

        Button btn_fragment_activity_fragment_two = (Button) findViewById(R.id.btn_fragment_activity_fragment_two);
        btn_fragment_activity_fragment_two.setOnClickListener(this);
        Button btn_fragment_activity_fragment = (Button) findViewById(R.id.btn_fragment_activity_fragment);
        btn_fragment_activity_fragment.setOnClickListener(this);

    }

    private void setDefaultFragment() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        activityMethodFragment = new ActivityMethodFragment();
        transaction.replace(R.id.content, activityMethodFragment);
        transaction.commit();
    }


    @Override
    public void onClick(View view) {

        FragmentManager fm = getFragmentManager();
        // 开启Fragment事务
        FragmentTransaction transaction = fm.beginTransaction();
        switch (view.getId()) {
            case R.id.btn_fragment_activity_fragment_two:
                if (activityMethodTwoFragment == null) {
                    activityMethodTwoFragment = new ActivityMethodTwoFragment();
                }
                transaction.replace(R.id.content, activityMethodTwoFragment);
                break;
            case R.id.btn_fragment_activity_fragment:
                if (activityMethodFragment == null) {
                    activityMethodFragment = new ActivityMethodFragment();
                }
                transaction.replace(R.id.content, activityMethodFragment);
                break;
        }
        transaction.commit();
    }


    public void method() {
        Toast.makeText(FragmentMethodActivity.this, "fragment调用activity的方法", Toast.LENGTH_SHORT).show();
    }


}
