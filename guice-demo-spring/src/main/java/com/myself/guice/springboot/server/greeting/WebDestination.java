package com.myself.guice.springboot.server.greeting;

import com.google.inject.servlet.RequestScoped;
import com.myself.guice.helloworlddemo.MyDestination;

import javax.inject.Inject;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 11:01 2018\4\23 0023
 */
@RequestScoped
public class WebDestination implements MyDestination{
    private final StringBuilder sb;

    @Inject
    public WebDestination( StringBuilder sb){
        System.out.println("WebDestination constructed.");
        this.sb = sb;
    }

    @Override
    public void write(String s) {
        sb.append(s);
    }

    public String getResult() {
        return sb.toString();
    }
}
