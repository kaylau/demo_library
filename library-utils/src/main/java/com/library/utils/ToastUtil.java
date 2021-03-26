package com.library.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @Author: Administrator
 * @E-mail: liukai@duandai.com
 * @CreateDate: 2021/3/26 11:18
 * @Description:
 */
public class ToastUtil {

    private Toast mToast;
    private TextView mTextView;

    private ToastUtil(Context context, CharSequence text, int duration) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout_toast, null);
        mTextView = v.findViewById(R.id.tv_custom_toast_text);
        mTextView.setText(text);
        mToast = new Toast(context);
        mToast.setDuration(duration);
        mToast.setView(v);

    }

    public static ToastUtil makeText(Context context, CharSequence text, int duration) {
        return new ToastUtil(context, text, duration);
    }

    public void show() {
        if (mToast != null) {
            mToast.show();
        }
    }

    public void setGravity(int gravity, int xOffset, int yOffset) {
        if (mToast != null) {
            mToast.setGravity(gravity, xOffset, yOffset);
        }
    }

    public void setText(String text) {
        if (mTextView != null) {
            mTextView.setText(text);
        }
    }
}
