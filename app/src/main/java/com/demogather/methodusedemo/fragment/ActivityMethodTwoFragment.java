package com.demogather.methodusedemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.demogather.methodusedemo.R;
import com.demogather.methodusedemo.adapter.FragmentMethodAdapter;

import java.util.ArrayList;
import java.util.List;

public class ActivityMethodTwoFragment extends Fragment implements View.OnClickListener {

    private ListView listView;
    private List<String> stringList;
    private FragmentMethodAdapter fragmentMethodAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_activity_method_two, null);

        initView(view);
        init();
        initData();

        return view;
    }

    private void initView(View view) {
        Button btn_fragment_adapter_method_two = (Button) view.findViewById(R.id.btn_fragment_adapter_method_two);
        btn_fragment_adapter_method_two.setOnClickListener(this);
        listView = (ListView) view.findViewById(R.id.listView);
    }

    private void init() {
        stringList = new ArrayList<String>();
        fragmentMethodAdapter = new FragmentMethodAdapter(getActivity(), stringList);
        listView.setAdapter(fragmentMethodAdapter);
        fragmentMethodAdapter.setOnUpdateListener(new FragmentMethodAdapter.OnUpdateListener() {
            @Override
            public void onUpdateClick(int position) {
                fragmentMethod(position);
            }
        });
    }

    private void fragmentMethod(int position){
        Toast.makeText(getActivity(),"adapter调用fragment中的方法:"+stringList.get(position), Toast.LENGTH_SHORT).show();
    }

    private void initData() {
        for (int i = 0; i < 100; i++) {
            stringList.add(String.valueOf("这个是:" + i));
        }
        fragmentMethodAdapter.notifyDataSetChanged();
    }

    private void clickOne() {
        fragmentMethodAdapter.adapterMethod();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_fragment_adapter_method_two:
                clickOne();
                break;
        }
    }
}
