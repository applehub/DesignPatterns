package com.applehub.dp.adapter;


interface Target {
    void request();
}


//适配者
class Adapter {

    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}



//类适配器类
class ClassAdapter extends Adapter implements Target {

    public void request() {
        specificRequest();
    }

    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
