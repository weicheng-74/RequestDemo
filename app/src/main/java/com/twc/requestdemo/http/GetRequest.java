package com.twc.requestdemo.http;

import android.util.Log;

public class GetRequest extends BaseRequest {
    @Override
    public String getMethod() {
        return HttpMethod.GET_REQUEST;
    }

    public void getMethodTest() {
        Log.e("getrequest", "get");
    }
}
