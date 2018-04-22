package com.myself.guice.helloworlddemo;

import com.google.inject.AbstractModule;
import com.myself.guice.MyApplet;

import java.io.PrintStream;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 13:36 2018\4\22 0022
 */
public class HelloWorldModule extends AbstractModule{

    @Override
    protected void configure() {
        // StringWritingApplet 实现了 MyApplet
        // Stringwritingapplet Realized MyApplet
        bind(MyApplet.class).to(StringWritingApplet.class);
        // PrintStreamWriter 实现了 MyDestination
        // Printstreamwriter Realized Mydestination
        bind(MyDestination.class).to(PrintStreamWriter.class);
        // PrintStream 绑定 System.out
        // PrintStream binding System.out
        bind(PrintStream.class).toInstance(System.out);
        // 作用等同于getString方法
        // Function Equals GetString method
        bind(String.class).annotatedWith(Output.class).toInstance("Hello World");
        // 当业务便复杂，需要获取数据，可以使用toProvider
        // When the business is complex, need to get data, you can use Toprovider
        /*bind(String.class).toProvider(new Provider<String>() {
            @Override
            public String get() {
                return "Hello World";
            }
        });*/
    }

//    @Provides private String getString(){
//        return "Hello World";
//    }
}