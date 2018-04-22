package com.myself.guice.helloworlddemo;

import com.google.inject.Provider;
import com.myself.guice.MyApplet;

import javax.inject.Inject;


/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 15:34 2018\4\19 0019
 */
public class StringWritingApplet implements MyApplet{

    private MyDestination destination;
    private Provider<String> stringProvider;

    @Inject
    public StringWritingApplet(MyDestination destination, @Output Provider<String> stringProvider) {
        super();
        this.destination = destination;
        this.stringProvider = stringProvider;
    }

    private void writeString(){
        destination.write( stringProvider.get() );
    }

    public void run() {
        writeString();
    }
}
