package com.annotations.create;

public class Driver {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println(myCat.getClass().isAnnotationPresent(VeryImportant.class));
    }
}
