package com.myself.guice.server;

import java.util.Set;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:15 2018\4\22 0022
 */
public interface PriceService {
    long getPrice(long orderId);

    Set<String> getSupportedCurrencies();
}
