package com.alex;

public class Person {
    String name;
    float weight;
    float height;
    //以上稱為 Person類別的屬性

    public float bmi () {
        float bmi  = weight / (height * height);
        return bmi;
    }
    public void hello(){
        System.out.println("Hello World");
    }
}



