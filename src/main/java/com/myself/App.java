package com.myself;

import com.google.common.base.Joiner;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import com.myself.guice.Applets;
import com.myself.guice.CommandLineModule;
import com.myself.guice.MainModule;
import com.myself.guice.MyApplet;

import javax.security.auth.login.Configuration;
import java.util.Map;

public class App {

    /**
     * bootstrap:
     * parse command line(解析命令行参数)
     * set up environment(配置环境参数)
     * kick off main logic(启动想要的应用)
     * @param args
     */
    // wrong applet name valid names are:hello,println
    public static void main( String[] args ) {
        Injector injector = Guice.createInjector(new MainModule(),new CommandLineModule(args));
        Applets.get(injector,args[0]).run();
    }
}
