package com.example.pawe.sixth;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Integer> {

    private Activity context;
    public CustomAdapter(@NonNull Activity context, int resource, @NonNull List<Integer> objects) {
        super(context, resource, objects);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View rowView =  layoutInflater.inflate(R.layout.custom_listviev_layout, null, true);

        TextView tvMain = (TextView) rowView.findViewById(R.id.textView2);
        TextView tvSub = (TextView) rowView.findViewById(R.id.textView3);

        tvMain.setText("Main title " + position);
        tvSub.setText("Sub title " + position);

        return rowView;
    }
}

