package com.myself.guice;

import com.myself.guice.helloworlddemo.PrintStreamWriter;
import com.myself.guice.helloworlddemo.StringProvider;
import com.myself.guice.helloworlddemo.StringWritingApplet;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 15:37 2018\4\19 0019
 */
public class Configuration {

    public static MyApplet gerMainApplet(){
        return new StringWritingApplet(new PrintStreamWriter(System.out), new StringProvider() {
            @Override
            public String get() {
                return "Hello World!";
            }
        });
    }

}
