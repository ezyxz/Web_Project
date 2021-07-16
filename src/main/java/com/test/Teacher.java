package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class Teacher {
    private Student student;
    private String name;
    private Map<Integer,Student> map;

    public void setMap(Map<Integer, Student> map) {
        this.map = map;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(){}
    public Teacher(Student student ){
        this.student = student;
    }

    public void setStudent(Student student){
        this.student = student;
    }
    public void run(){
        System.out.print("Teacher "+name+"  running...");
        student.run();
    }

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher obj = (Teacher)app.getBean("getTeacherWithDep");
        obj.run();
        System.out.println("===================");
        obj = (Teacher)app.getBean("getTeacherWithParm");
        obj.run();

    }
}
