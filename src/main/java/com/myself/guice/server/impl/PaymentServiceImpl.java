package com.myself.guice.server.impl;

import com.google.common.cache.Cache;
import com.myself.guice.server.PaymentService;

import javax.inject.Inject;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:24 2018\4\22 0022
 */
public class PaymentServiceImpl implements PaymentService{

    private final Cache<String,String> cache;

    @Inject
    public PaymentServiceImpl(Cache<String, String> cache) {
        super();
        this.cache = cache;
    }

    @Override @Logged
    public void pay(long orderId, long price, Long sessionId) {

    }

    void putCache(String key,String value){
        cache.put(key,value);
    }
}
