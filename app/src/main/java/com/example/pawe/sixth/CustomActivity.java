package com.example.pawe.sixth;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i=0;i<100;i++){
            arrayList.add(i);
        }
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.custom_listviev_layout,arrayList);
        ListView listView = findViewById(R.id.lv_custom);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CustomActivity.this,"Main title " + position + "\n Sub Title " + position,Toast.LENGTH_SHORT).show();;
            }
        });
    }
}
