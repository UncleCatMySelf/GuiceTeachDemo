package com.myself.guice;

import com.google.common.base.Joiner;
import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.name.Names;
import com.myself.guice.helloworlddemo.MyDestination;

import java.nio.file.attribute.FileTime;
import java.util.Map;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 17:00 2018\4\22 0022
 */
public class Applets {

    public static class AppletRegister{
        private final Binder binder;

        public AppletRegister(Binder binder) {
            super();
            this.binder = binder;
        }

        public LinkedBindingBuilder<MyApplet> named(String name) {
            return MapBinder.newMapBinder(
                    binder,String.class,MyApplet.class)
                    .addBinding(name);
        }
    }

    public static MyApplet get(Injector injector, String name){
        Map<String, MyApplet> applets = injector.getInstance(
                Key.get(new TypeLiteral<Map<String, MyApplet>>(){}));
        if (!applets.containsKey(name)){
            throw new IllegalArgumentException("Unable to find applet."
                    + "Valid applets are "
                    + Joiner.on(", ").join(applets.keySet()));
        }
        return applets.get(name);
    }

    public static AppletRegister registerApplet(Binder binder) {
        return new AppletRegister(binder);
    }
}
