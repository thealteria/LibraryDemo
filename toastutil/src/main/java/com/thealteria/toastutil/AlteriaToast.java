package com.thealteria.toastutil;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

public class AlteriaToast {
    @SuppressLint("StaticFieldLeak")
    private static Context context;

    public static void toast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
