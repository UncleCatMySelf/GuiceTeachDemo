package com.myself.guice.springboot.server.greeting;

import com.myself.guice.springboot.server.persistence.SampleDao;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 12:19 2018\4\23 0023
 */
public class GreetingMessageProvider implements Provider<String>{
    private final RequestParams params;
    private final SampleDao sampleDao;

    @Inject
    public GreetingMessageProvider(RequestParams params,SampleDao sampleDao) {
        this.params = params;
        this.sampleDao = sampleDao;
    }

    @Override
    public String get() {
        sampleDao.getPersonData(params.getGreetingName());
        return "Hello " + params.getGreetingName();
    }
}
