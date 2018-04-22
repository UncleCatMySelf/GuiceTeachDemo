package com.myself.guice.server.impl;

import com.google.common.base.Joiner;
import com.google.inject.Provider;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import javax.inject.Inject;
import java.lang.reflect.Method;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 20:59 2018\4\22 0022
 */
public class LoggingInterceptor implements MethodInterceptor{
    @Inject @SessionId private Provider<Long> sessionIdProvider;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        System.out.println(String.format("In session %d: Calling %s#%s(%s)",
                sessionIdProvider.get(),
                method.getDeclaringClass().getName(),
                method.getName(),
                Joiner.on(",").join(
                        invocation.getArguments())));
        return invocation.proceed();
    }
}
