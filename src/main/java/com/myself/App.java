package com.myself;

import com.google.inject.Guice;
import com.myself.guice.MainModule;
import com.myself.guice.MyApplet;

import javax.security.auth.login.Configuration;

public class App {

    /**
     * bootstrap:
     * parse command line(解析命令行参数)
     * set up environment(配置环境参数)
     * kick off main logic(启动想要的应用)
     * @param args
     */
    public static void main( String[] args ) {
        MyApplet mainApplet = Guice.createInjector(new MainModule()).getInstance(MyApplet.class);
        mainApplet.run();
    }
}
