package com.thealteria.toastutil;

import android.content.Context;
import android.widget.Toast;

public class AlteriaToast {
    private Context context;

    public void toast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
