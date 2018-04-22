package com.myself.guice.server;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:10 2018\4\22 0022
 */
public interface OrderService {
    void sendToPayment(long orderId);
}
