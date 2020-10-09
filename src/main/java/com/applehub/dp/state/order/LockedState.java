package com.applehub.dp.state.order;

public class LockedState implements OrderState{


    @Override
    public void confirm(Order order) {
        System.out.println("订单已锁定");
    }

    @Override
    public void modify(Order order) {
        System.out.println("订单已锁定");
    }

    @Override
    public void pay(Order order) {
        System.out.println("订单已锁定");
    }
}
