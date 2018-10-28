package com.twc.requestdemo.http;

import android.util.Log;

public class PostRequest extends BaseRequest<PostRequest> {
    @Override
    public String getMethod() {
        return HttpMethod.POST_REQUEST;
    }

    public void postMethodTest() {
        Log.e("getrequest", "get");
    }
}
