package com.applehub.dp.state.order;

public class ConfirmedState implements OrderState{


    @Override
    public void confirm(Order order) {
        System.out.println("订单已确认，请勿重复确认");
    }

    @Override
    public void modify(Order order) {
        System.out.println("订单已修改，请再次确认");
        order.setOrderState(new OrderedState());
    }

    @Override
    public void pay(Order order) {
        System.out.println("订单已支付，无法再修改");
        order.setOrderState(new LockedState());
    }
}
