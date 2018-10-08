package com.thealteria.librarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thealteria.toastutil.LatlngAddress;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LatlngAddress.currentAddress();
    }
}
