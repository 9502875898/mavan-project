package com.javateki.tx.exception;

public class InsufficientAmountException extends RuntimeException{
    public  InsufficientAmountException(String msg){
        super(msg);
    }
}
