package com.demogather.methodusedemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.demogather.methodusedemo.R;
import com.demogather.methodusedemo.activity.ActivityMethodAdapterActivity;

import java.util.List;

/**
 * 适配器调用界面的方法
 */

public class ActivityMethodAdapter extends BaseAdapter {

    private Context context;
    private List<String> list;
    private LayoutInflater mInflater;

    public ActivityMethodAdapter(Context context,List<String> list){
        this.context = context;
        this.list = list;
        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public String getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.adapter_method_activity, null);
            holder = new ViewHolder();
            holder.textView = (TextView)convertView.findViewById(R.id.tv_item_activity_adapter_name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.textView.setText(list.get(position));
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ActivityMethodAdapterActivity)context).method(position);
            }
        });
        return convertView;
    }


    public static class ViewHolder {
        public TextView textView;
    }

    public void adapterMethod(){
        Toast.makeText(context,"activity调用了adapter的方法",Toast.LENGTH_SHORT).show();
    }

}
