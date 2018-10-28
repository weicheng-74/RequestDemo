package com.twc.requestdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.twc.requestdemo.http.GetRequest;
import com.twc.requestdemo.http.PostRequest;
import com.twc.requestdemo.http.factory.BaseRequestFactory;
import com.twc.requestdemo.http.factory.Factory;

public class MainActivity extends AppCompatActivity {
    private Factory factory;
    private PostRequest postRequest;
    private GetRequest getRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        factory = new BaseRequestFactory();
        postRequest = factory.createRequest(PostRequest.class);
        getRequest = factory.createRequest(GetRequest.class);
        getRequest.getMethodTest();
    }
}
