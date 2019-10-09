package com.example.lab4;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String colors[];
    LayoutInflater inflater;

    public CustomAdapter(Context context, String colors[]){
        this.context = context;
        this.colors = colors;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.spinner, null);
        TextView textView = view.findViewById(R.id.textView);
        String colorValue = colors[position];
        textView.setText(colorValue);
        textView.setBackgroundColor(Color.parseColor(colorValue));
        textView.setTextSize(26);

        return view;
    }
}
