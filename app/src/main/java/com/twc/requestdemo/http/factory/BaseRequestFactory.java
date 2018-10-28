package com.twc.requestdemo.http.factory;

import com.twc.requestdemo.http.BaseRequest;

/**
 * 工厂类反射获取即可。
 */
public class BaseRequestFactory extends Factory {
    @Override
    public <T extends BaseRequest> T createRequest(Class<T> clz) {
        BaseRequest baseRequest = null;
        try {
            baseRequest = (BaseRequest) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) baseRequest;
    }
}
