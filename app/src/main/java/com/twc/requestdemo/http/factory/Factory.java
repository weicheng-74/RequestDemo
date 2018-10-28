package com.twc.requestdemo.http.factory;

import com.twc.requestdemo.http.BaseRequest;

/**
 * 来一个工厂
 */
public abstract class Factory {
    /**
     * 抽象的工厂方法，具体产生什么由子类去决定。
     *
     * @param clz
     * @param <T>
     * @return
     */
    public abstract <T extends BaseRequest> T createRequest(Class<T> clz);
}
