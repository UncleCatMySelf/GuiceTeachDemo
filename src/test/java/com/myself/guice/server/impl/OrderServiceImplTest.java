package com.myself.guice.server.impl;

import com.google.inject.*;
import com.google.inject.util.Modules;
import com.myself.guice.server.OrderService;
import com.myself.guice.server.PriceService;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:27 2018\4\22 0022
 */

class PriceServiceMock extends PriceServiceImpl{
    @javax.inject.Inject
    public PriceServiceMock(Set<String> supportedCurrencies) {
        super(supportedCurrencies,null);
    }

    @Override
    public long getPrice(long orderId) {
        return 567L;
    }
}

public class OrderServiceImplTest {

    // 使用Guice提供的可以对成员变量进行注入的实现，方便测试
    // Using the Guice provided can inject the member variable into the implementation to facilitate testing
    @Inject private OrderService orderService;
//    @Inject @Named("supportedCurrencies") private Provider<List<String>> supportedCurrenciesProvider;
    @Inject private PriceService priceService;

    @Before public void setUp(){
        Guice.createInjector(Modules.override(new ServerModule())
                /*new AbstractModule() {
                    @Override
                    protected void configure() {
                        bind(PriceService.class).toInstance(new PriceServiceImpl(){
                            @Override
                            public long getPrice(long orderId) {
                                return 567L;
                            }
                        });
                    }}*/
                .with(new AbstractModule() {
                    @Override
                    protected void configure() {
                        bind(PriceService.class).to(PriceServiceMock.class);
                    }
                })
        ).injectMembers(this);
    }

    @Test
    public void testSendToPayment(){
        // OrderService orderService = Guice.createInjector(new ServerModule()).getInstance(OrderService.class);
        orderService.sendToPayment(789L);
    }

    @Test
    public void testSupportedCurrencies(){
        throw new RuntimeException(priceService.getSupportedCurrencies().toString());
    }

}