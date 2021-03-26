package com.library.testlibrary;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @Author: Administrator
 * @E-mail: liukai@duandai.com
 * @CreateDate: 2021/3/26 10:42
 * @Description:
 */
public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        String stringExtra = getIntent().getStringExtra("key");
        TextView tv = findViewById(R.id.tv);

        Handler handler = new Handler(Looper.myLooper()) {
            @Override
            public void handleMessage(@NonNull Message msg) {
                if (msg.what == 0) {
                    tv.setText(((String) msg.obj));
                }
            }
        };

        Message message = new Message();
        message.what = 0;
        message.obj = stringExtra;
        handler.sendMessageDelayed(message, 5000);

    }
}
