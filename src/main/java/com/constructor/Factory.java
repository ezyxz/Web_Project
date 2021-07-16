package com.constructor;

import com.test.MyImp;

public class Factory {

    public static  MyImp  staticGetObj(){
        return new MyImp();
    }

    public  MyImp  dynamicGetObj(){
        return new MyImp();
    }
}
