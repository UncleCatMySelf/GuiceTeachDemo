package com.myself.guice.printlndemo;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.name.Names;
import com.myself.guice.Applets;
import com.myself.guice.MyApplet;
import com.myself.guice.helloworlddemo.StringWritingApplet;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 16:18 2018\4\22 0022
 */
public class PrintLineModule extends AbstractModule{

    @Override
    protected void configure() {
        /*MapBinder.newMapBinder(binder(),String.class,MyApplet.class)
                .addBinding("println").to(PrintLineApplet.class);*/
        Applets.registerApplet(binder()).named("println").to(PrintLineApplet.class);
    }
}
