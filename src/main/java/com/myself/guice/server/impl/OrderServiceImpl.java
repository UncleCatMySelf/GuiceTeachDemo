package com.myself.guice.server.impl;

import com.myself.guice.server.OrderService;
import com.myself.guice.server.PaymentService;
import com.myself.guice.server.PriceService;

import javax.inject.Inject;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:13 2018\4\22 0022
 */
public class OrderServiceImpl implements OrderService{
    // Dependencies
    // 产品价格  Product price
    private final PriceService priceService;
    // 最后付款  Final payment
    private final PaymentService paymentService;
    // 获取相关Session信息  Get related session information
    private final SessionManager sessionManager;

    // States
    private Long ordersPaid = 0L;

    @Inject
    public OrderServiceImpl(PriceService priceService, PaymentService paymentService, SessionManager sessionManager) {
        super();
        this.priceService = priceService;
        this.paymentService = paymentService;
        this.sessionManager = sessionManager;
    }

    @Logged
    public void sendToPayment(long orderId){
        long price = priceService.getPrice(orderId);
        paymentService.pay(orderId, price, sessionManager.getSessionId());
        ordersPaid = ordersPaid + 1;

        // 查看方法是否真实的执行核心业务逻辑
        // To see if the method actually executes the core business logic
        throw new RuntimeException(
                "Price=" + price
                + ". SessionId="
                + sessionManager.getSessionId()
                + ". ordersPaid= " + ordersPaid);
    }
}
