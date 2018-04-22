package com.myself.guice.server.impl;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 15:33 2018\4\22 0022
 */
public class GlobalModule extends AbstractModule{

    @Override
    protected void configure() {
        // adds EUR , USD support
        Multibinder<String> currencyBinder = Multibinder.newSetBinder(binder(),String.class);
        currencyBinder.addBinding().toInstance("EUR");
        currencyBinder.addBinding().toInstance("USD");
    }
}
