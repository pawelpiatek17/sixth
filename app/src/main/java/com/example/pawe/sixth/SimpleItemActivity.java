package com.example.pawe.sixth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SimpleItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_item);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i=0;i<100;i++){
            arrayList.add("Main title " + i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.simple_listviev,arrayList);
        ListView listView = (ListView) findViewById(R.id.lv_simple_item);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SimpleItemActivity.this,"Main title " + position,Toast.LENGTH_SHORT).show();;
            }
        });
    }
}
