package com.myself.guice.server;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:15 2018\4\22 0022
 */
public interface PaymentService {
    void pay(long orderId, long price, Long sessionId);
}
