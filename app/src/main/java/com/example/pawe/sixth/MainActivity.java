package com.example.pawe.sixth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oneStringItem(View view) {
        Intent intent = new Intent(this,OneStringItemActivity.class);
        startActivity(intent);
    }

    public void simpleItemLayout(View view) {
        Intent intent = new Intent(this,SimpleItemActivity.class);
        startActivity(intent);
    }

    public void twoStringsItem(View view) {
        Intent intent = new Intent(this,TwoStringsActivity.class);
        startActivity(intent);
    }

    public void customLayout(View view) {
        Intent intent = new Intent(this,CustomActivity.class);
        startActivity(intent);
    }
}
