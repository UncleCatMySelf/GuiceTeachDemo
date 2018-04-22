package com.myself.guice.server.impl;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.*;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:49 2018\4\22 0022
 */
public class SessionManagerTest {

    @Inject SessionManager sessionManager;

    @Before public void setUp(){
        Guice.createInjector(new ServerModule()).injectMembers(this);
    }

    @Test
    public void getSessionId() throws Exception {
        Long sessionId1 = sessionManager.getSessionId();
        // Pretend we sleep long enough so session expires.
        Thread.sleep(1000);
        Long sessionId2 = sessionManager.getSessionId();
        assertNotEquals(sessionId2.longValue(),sessionId1.longValue());
    }

}