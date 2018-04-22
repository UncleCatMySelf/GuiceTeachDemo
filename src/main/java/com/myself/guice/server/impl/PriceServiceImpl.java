package com.myself.guice.server.impl;

import com.myself.guice.server.PriceService;
import com.google.common.cache.Cache;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:24 2018\4\22 0022
 */
public class PriceServiceImpl implements PriceService{

    private final Set<String> supportedCurrencies;
    private final Cache<String,String> cache;

    @Inject
    public PriceServiceImpl(Set<String> supportedCurrencies,Cache<String,String> cache) {
        super();
        this.supportedCurrencies = supportedCurrencies;
        this.cache = cache;
    }

    @Override
    public long getPrice(long orderId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<String> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    String getCacheValue(String key){
        return cache.getIfPresent(key);
    }
}
