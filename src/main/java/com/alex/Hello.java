package com.alex;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person p = new Person();
        p.hello();
        //不能再呼叫p的值
        new Person().hello();
    }
}
