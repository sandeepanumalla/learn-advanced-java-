package com.learning.Threads;
import com.learning.Singleton;

public class Driver {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        instance.setName("instance1");
        instance2.setName("instance2");
        System.out.println(instance.getName());
        System.out.println(instance2.getName());
    }


}
