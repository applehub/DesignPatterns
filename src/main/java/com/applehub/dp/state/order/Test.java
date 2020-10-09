package com.applehub.dp.state.order;

/**
 * @program: DesignPatterns
 * @description:
 * @Author: applehub.dong
 * @Date: 2020/10/9 14:55
 */

public class Test {

    public static void main(String[] args) {
        Order order=new Order();
        order.setOrderState(new OrderedState());

        order.getOrderState().pay(order);

        order.getOrderState().confirm(order);
        order.getOrderState().modify(order);
        order.getOrderState().confirm(order);
        order.getOrderState().pay(order);
        order.getOrderState().modify(order);
    }

}
