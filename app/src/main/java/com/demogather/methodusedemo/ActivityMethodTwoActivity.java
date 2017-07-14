package com.demogather.methodusedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMethodTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_two);

        Button btn_activity_method_activity_two = (Button) findViewById(R.id.btn_activity_method_activity_two);
        btn_activity_method_activity_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click();
            }
        });

    }

    private void click(){
        ActivityMethodActivity.instance.method();
    }


}
