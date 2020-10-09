package com.applehub.dp.state.order;

public class OrderedState implements OrderState{


    @Override
    public void confirm(Order order) {
        System.out.println("订单已确认");
        order.setOrderState(new ConfirmedState());
    }

    @Override
    public void modify(Order order) {
        System.out.println("订单已修改");
    }

    @Override
    public void pay(Order order) {
        System.out.println("预定状态无法完成订单！");
    }
}
