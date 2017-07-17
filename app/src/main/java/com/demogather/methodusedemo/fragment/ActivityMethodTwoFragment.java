package com.demogather.methodusedemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.demogather.methodusedemo.R;

public class ActivityMethodTwoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_activity_method_two, null);

        initView(view);

        return view;
    }

    private void initView(View view){
        Button btn_fragment_activity_method_two = (Button) view.findViewById(R.id.btn_fragment_activity_method_two);
        btn_fragment_activity_method_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //通过activity调用fragment当中的方法
            }
        });
    }




}
