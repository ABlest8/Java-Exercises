package com.task3;

public class NotEnoughMoneyException extends Throwable {
    public NotEnoughMoneyException(String errorMessage){
        super(errorMessage);
    }
}
