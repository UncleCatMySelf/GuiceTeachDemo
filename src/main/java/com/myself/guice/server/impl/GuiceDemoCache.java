package com.myself.guice.server.impl;

import com.google.common.cache.AbstractCache;
import javax.inject.Singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 20:23 2018\4\22 0022
 */
@Singleton
public class GuiceDemoCache extends AbstractCache<String,String>{

    // 单例需要线程安全的环境   Single case requires a thread-safe environment
    private final Map<String,String> keyValues = new ConcurrentHashMap<>();

    @Override
    public String getIfPresent(Object key) {
        return keyValues.get(key);
    }

    @Override
    public void put(String key, String value) {
        keyValues.put(key,value);
    }
}
