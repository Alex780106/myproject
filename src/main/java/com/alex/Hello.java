package com.alex;

import java.lang.ref.Reference;

public class Hello {
    public static void main(String[] args) {
        Person p = new Person();
        p.hello();
        int age = 19;
        Integer age2 = 19;
        age2.intValue();//參照資料型態
        Character c3 = 'A';
        char c = 'A';
        byte b = 120;
        float weight = 66.5f;
        double height = 1.7;
        boolean y = true;
        boolean enroll = false;
        String name = "Tom";
    }
}
