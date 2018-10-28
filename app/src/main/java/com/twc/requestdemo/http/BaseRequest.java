package com.twc.requestdemo.http;

import java.io.Serializable;

public abstract class BaseRequest<R extends BaseRequest> implements Serializable {
    protected String baseUrl;
    protected int retryCount;
    protected String cacheKey;
    protected long cacheTime;

    public BaseRequest() {
    }

    public BaseRequest(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * post 请求或者其他。
     *
     * @return
     */
    public abstract String getMethod();


}
