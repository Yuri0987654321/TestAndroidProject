package com.example.test;

import android.app.Application;

public class ExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Test.test(null);
    }

}
