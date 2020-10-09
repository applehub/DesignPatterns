package com.applehub.dp.factorymethod;

public class CarFactory {
    public MoveAble create() {
        System.out.println("a car created!");
        return new Car();
    }
}
