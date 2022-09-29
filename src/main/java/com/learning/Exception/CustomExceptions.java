package com.learning.Exception;

public class CustomExceptions extends Exception {
    CustomExceptions(){
        super("Cannot divide with zero");
    }
    CustomExceptions(String message){
        super(message);
    }
}
