package com.library.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.library.testlibrary.Test2;
import com.library.testlibrary.TestUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestUtil.test(this, "MainActivity--->toast");
        Test2.test2("test2.....");

    }

    public void startAct(View view) {
        int id = view.getId();
        Log.e("TAG", "id: " + id);
        TestUtil.startAct(this, "MainActivity open activity");
    }
}