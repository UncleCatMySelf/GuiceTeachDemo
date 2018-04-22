package com.myself.guice.helloworlddemo;

import java.io.PrintStream;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 21:59 2018\4\19 0019
 */
public class PrintStreamWriter implements MyDestination {

    private PrintStream destination;

    public PrintStreamWriter(PrintStream destination) {
        super();
        this.destination = destination;
    }

    @Override
    public void write(String String) {
        destination.println(String);
    }
}
