package com.reacttest;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class TestClass extends ReactContextBaseJavaModule {

    ReactApplicationContext context;
    TestClass(ReactApplicationContext context) {
        super(context);
        this.context = context;
    }

    @NonNull
    @Override
    public String getName() {
        return "TestClass";
    }

    @ReactMethod
    public void getStatus(int tag) {
        if (tag == 0) {
            //failure.invoke("Failed");
            Toast.makeText(context, "Failed", Toast.LENGTH_LONG).show();
        } else {
            //success.invoke("Hello World");
            Toast.makeText(context, "Success", Toast.LENGTH_LONG).show();
        }
    }
}
