package com.demogather.methodusedemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.demogather.methodusedemo.R;
import com.demogather.methodusedemo.activity.FragmentMethodActivity;

public class ActivityMethodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_activity_method, null);

        initView(view);

        return view;
    }

    private void initView(View view){
        Button btn_fragment_activity_method = (Button) view.findViewById(R.id.btn_fragment_activity_method);
        btn_fragment_activity_method.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((FragmentMethodActivity)getActivity()).method();
            }
        });
    }

    public void method(){
        Toast.makeText(getActivity(),"第二个fragment调用第一个fragment的方法",Toast.LENGTH_SHORT).show();
    }




}
