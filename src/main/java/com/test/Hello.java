package com.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyImp myObj = (MyImp)app.getBean("myBean");
        myObj.save();
        System.out.println("static factory==========");
        MyImp myObj2 = (MyImp)app.getBean("myConstructor");
        myObj2.save();
        System.out.println(myObj == myObj2);
        System.out.println("dynamic factory==========");
        MyImp myObj3 = (MyImp)app.getBean("myDynamicConstructor");
        myObj3.save();



    }
}
