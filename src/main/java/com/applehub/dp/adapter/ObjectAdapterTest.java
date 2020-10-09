package com.applehub.dp.adapter;


class ObjectAdapter implements Target {

    private Adapter adapter;

    public ObjectAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    public void request() {
        adapter.specificRequest();
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        Target target = new ObjectAdapter(adapter);
        target.request();
    }
}
