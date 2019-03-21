package com.alex;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person p = new Person();
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());

    /*    int age = 19;
        Integer age2 = 19;
        age2.hashCode(); //物件 參造資料型態
        char f = '中';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        double height = 1.7;
        boolean yes = true;
        boolean enroll = false;
        String name = "Tom";*/


    }
}
