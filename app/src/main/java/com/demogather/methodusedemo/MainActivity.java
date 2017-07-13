package com.demogather.methodusedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_one_click = (Button) findViewById(R.id.btn_one_click);
        btn_one_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,TwoActivity.class));
            }
        });

        init();

    }

    public static MainActivity instance = null;

    private void init() {
        instance = this;
    }

    public void method(){
        Toast.makeText(MainActivity.this,"第二个界面调用了第一个界面的方法",Toast.LENGTH_SHORT).show();
    }


}
