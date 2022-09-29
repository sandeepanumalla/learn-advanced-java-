package com.learning;

public class Singleton {
     static Singleton instance = new Singleton();

    public static void setName(String name) {
        Singleton.name = name;
    }

    public static String getName() {
        return name;
    }

    static private  String name = "sandeep";

    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }
}

