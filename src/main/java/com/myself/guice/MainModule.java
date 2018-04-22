package com.myself.guice;

import com.google.inject.AbstractModule;
import com.myself.guice.helloworlddemo.HelloWorldModule;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 13:23 2018\4\22 0022
 */
public class MainModule extends AbstractModule{

    @Override
    protected void configure() {
        install(new HelloWorldModule());
    }

}
