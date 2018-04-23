package com.myself.guice.springboot.server.greeting;

import com.google.inject.AbstractModule;
import com.myself.guice.MyApplet;
import com.myself.guice.helloworlddemo.MyDestination;
import com.myself.guice.helloworlddemo.Output;
import com.myself.guice.helloworlddemo.StringWritingApplet;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 11:19 2018\4\23 0023
 */
public class HelloWorldWebModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(MyApplet.class).to(StringWritingApplet.class);
        bind(MyDestination.class).to(WebDestination.class);
        bind(String.class).annotatedWith(Output.class).toProvider(GreetingMessageProvider.class);
    }

//    @Provides @Output String getOutputString(GreetingMessageProvider messageProvider){
//        return messageProvider.get();
//    }
}
