package com.myself.guice.server.impl;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:57 2018\4\22 0022
 */
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
public @interface SessionId {
}
