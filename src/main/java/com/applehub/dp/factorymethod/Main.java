package com.applehub.dp.factorymethod;

public class Main {
    public static void main(String[] args) {
        MoveAble m = new CarFactory().create();
        m.go();
    }
}
