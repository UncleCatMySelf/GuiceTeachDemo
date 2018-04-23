package com.myself.guice.springboot.server.greeting;

import com.google.inject.servlet.RequestScoped;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 11:05 2018\4\23 0023
 */
@RequestScoped
public class RequestParams {

    private String greetingName;

    public RequestParams() {
        System.out.println("RequestParams constructed.");
    }

    public String getGreetingName() {
        return greetingName;
    }

    public void setGreetingName(String greetingName) {
        this.greetingName = greetingName;
    }
}
