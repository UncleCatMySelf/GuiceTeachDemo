package com.myself.guice.server.impl;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 20:32 2018\4\22 0022
 */
public class CacheTest {

    @Inject PaymentServiceImpl paymentService;
    @Inject PriceServiceImpl priceService;

    @Before
    public void setUp(){
        Guice.createInjector(new ServerModule()).injectMembers(this);
    }

    @Test
    public void testCache(){
        paymentService.putCache("testValue","testValue");
        String cacheValue = priceService.getCacheValue("testValue");
        assertEquals("testValue",cacheValue);
    }

}
