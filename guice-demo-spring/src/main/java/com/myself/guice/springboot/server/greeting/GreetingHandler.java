package com.myself.guice.springboot.server.greeting;

import com.google.inject.servlet.RequestScoped;
import com.myself.guice.MyApplet;

import javax.inject.Inject;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 12:11 2018\4\23 0023
 */
@RequestScoped
public class GreetingHandler {

    private final RequestParams params;
    private final WebDestination destination;
    private final MyApplet applet;

    @Inject
    public GreetingHandler(RequestParams params, WebDestination destination, MyApplet applet) {
        this.params = params;
        this.destination = destination;
        this.applet = applet;
    }

    public String getByName(String name) {
        params.setGreetingName(name);
        applet.run();
        return destination.getResult();
    }

}
