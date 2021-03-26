package com.library.testlibrary;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * @Author: Administrator
 * @E-mail: liukai@duandai.com
 * @CreateDate: 2021/3/25 18:02
 * @Description:
 */
public class TestUtil {

    public static void test(Context context, String string) {
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
        Log.e("TAG", "test: " + string);
    }

    public static void startAct(Context context, String params) {
        Intent intent = new Intent(context, TestActivity.class);
        intent.putExtra("key", params);
        context.startActivity(intent);
    }
}
