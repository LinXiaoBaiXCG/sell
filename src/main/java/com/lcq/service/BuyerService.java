package com.lcq.service;

import com.lcq.dto.OrderDTO;

/**
 * 买家订单详情和取消订单安全写法
 * Created by lcq
 * 2017-06-22 00:11
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
