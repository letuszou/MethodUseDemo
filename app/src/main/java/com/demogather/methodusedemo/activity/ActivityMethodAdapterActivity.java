package com.demogather.methodusedemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.demogather.methodusedemo.R;
import com.demogather.methodusedemo.adapter.ActivityMethodAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * 适配器调用界面的方法
 */

public class ActivityMethodAdapterActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> stringList;
    private ActivityMethodAdapter activityMethodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_adapter);

        initView();
        init();
        initData();

    }

    private void initView(){
        listView = (ListView) findViewById(R.id.listView);
        Button btn_adapter_method_activity = (Button) findViewById(R.id.btn_adapter_method_activity);
        btn_adapter_method_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMethodAdapter.adapterMethod();
            }
        });
    }

    private void init(){
        stringList = new ArrayList<String>();
        activityMethodAdapter = new ActivityMethodAdapter(ActivityMethodAdapterActivity.this,stringList);
        listView.setAdapter(activityMethodAdapter);

    }

    private void initData(){
        for(int i = 0 ;i<100;i++){
            stringList.add(String.valueOf("这个是:"+i));
        }
        activityMethodAdapter.notifyDataSetChanged();
    }

    public void method(int position){
        Toast.makeText(ActivityMethodAdapterActivity.this,"adapter调用activity的方法,位置为:"+position,Toast.LENGTH_SHORT).show();
    }


}
