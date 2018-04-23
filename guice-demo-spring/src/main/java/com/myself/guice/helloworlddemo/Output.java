package com.myself.guice.helloworlddemo;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 注解作用，保证Output在编译与运行期间均保留，及告诉Guice此注解被用于绑定
 * Annotations to ensure that output is retained during compilation and operation, And tell Guice this annotation is used to bind
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 13:39 2018\4\22 0022
 */
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
public @interface Output {

}
