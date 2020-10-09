package com.applehub.dp.state.order;

public interface OrderState {

    void confirm(Order order);

    void modify(Order order);

    void pay(Order order);

}
