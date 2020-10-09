package com.applehub.dp.state.order;

import lombok.Data;

@Data
public class Order {

    private int money;

    private OrderState orderState;
 }
