package com.opencv.jnovoa.android_opencvbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    private final static String Tag = "MainActivity";

    static {
        if (!OpenCVLoader.initDebug())
        {
            Log.d(Tag,"OPENCV not load");
        }else{
            Log.d(Tag,"OPENCV  load");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
