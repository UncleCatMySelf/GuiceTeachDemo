package com.myself;

import com.myself.guice.Configuration;
import com.myself.guice.MyApplet;

public class App {

    /**
     * bootstrap:
     * parse command line(解析命令行参数)
     * set up environment(配置环境参数)
     * kick off main logic(启动想要的应用)
     * @param args
     */
    public static void main( String[] args ) {
        // There is still dependency on HelloWorldPrinter.
        // 依然对HelloWorldPrinter存在依赖
        // HelloWorldPrinter mainApplet = Configuration.gerMainApplet();
        MyApplet mainApplet = Configuration.gerMainApplet();
        Configuration.gerMainApplet().run();
    }
}
