package com.myself.guice.springboot.server.persistence;

import org.springframework.stereotype.Component;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 11:57 2018\4\23 0023
 */
@Component
public class SampleDao {

    public void save(String data){
        System.out.println(data + " saved.");
    }

    public String getPersonData(String name){
        System.out.println("Getting person data for: " + name);
        return name;
    }
}
