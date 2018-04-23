package com.myself.guice.springboot.server.controller;

import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.servlet.ServletModule;
import org.springframework.context.ApplicationContext;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 12:02 2018\4\23 0023
 */
public class SpringAwareServletModule extends AbstractModule {

    private final ApplicationContext context;

    public SpringAwareServletModule(ApplicationContext context) {
        this.context = context;
    }

    @Override
    protected void configure() {
        install(new ServletModule());
        bind(ApplicationContext.class).toInstance(context);
    }

//    @Provides SampleDao getSampleDao(ApplicationContext context){
//        return context.getBean(SampleDao.class);
//    }
}
