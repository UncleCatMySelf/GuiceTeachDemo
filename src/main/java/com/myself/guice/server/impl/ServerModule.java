package com.myself.guice.server.impl;

import com.google.common.base.Joiner;
import com.google.common.cache.Cache;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.google.inject.matcher.Matchers;
import com.google.inject.name.Names;
import com.myself.guice.server.OrderService;
import com.myself.guice.server.PaymentService;
import com.myself.guice.server.PriceService;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import javax.inject.Named;
import javax.inject.Singleton;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:25 2018\4\22 0022
 */
public class ServerModule extends AbstractModule{

    @Override
    protected void configure() {
        install(new ChinaModule());
        install(new GlobalModule());
        bind(OrderService.class).to(OrderServiceImpl.class);
        bind(PaymentService.class).to(PaymentServiceImpl.class);
        bind(PriceService.class).to(PriceServiceImpl.class);

//        bind(new TypeLiteral<Cache<String,String>>(){}).to(GuiceDemoCache.class).in(Singleton.class);
        bind(new TypeLiteral<Cache<String,String>>(){}).to(GuiceDemoCache.class);

        LoggingInterceptor loggingInterceptor = new LoggingInterceptor();
        requestInjection(loggingInterceptor);

        bindInterceptor(Matchers.any(),
                Matchers.annotatedWith(Logged.class),
                loggingInterceptor
                );

        /*bind(Long.class).annotatedWith(SessionId.class)
                .toInstance(System.currentTimeMillis());
        bind(Long.class).annotatedWith(Names.named("appId"))
                .toInstance(456L);*/

        /*bind(new TypeLiteral<List<String>>(){})
                .annotatedWith(Names.named("supportedCurrencies"))
                .toInstance(Arrays.asList("CNY","EUR","USD"));*/

        // 实例绑定
//        bind(PriceService.class).toInstance(new PriceServiceImpl());
        // 采用匿名类方法
        /*bind(PriceService.class).toInstance(new PriceServiceImpl(){
            @Override
            public long getPrice(long orderId) {
                return 456L;
            }
        });*/
    }

    @Provides @SessionId Long generateSessionId(){
        return System.currentTimeMillis();
    }

    /*@Provides @Named("supportedCurrencies")
    List<String> getSupportedCurrencies(PriceService priceService){
        return priceService.getSupportedCurrencies();
    }*/

//    @Provides @Singleton Cache<String,String> getCache(){
//        return new GuiceDemoCache();
//    }
}
