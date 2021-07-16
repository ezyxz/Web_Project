package com.test;

public class MyImp implements MyInterface{
    @Override
    public void save() {
        System.out.println("saving running!!!");
    }
    public void init(){
        System.out.println("init running!!!");
    }
    public  void destory(){
        System.out.println("destory running");
    }
}
