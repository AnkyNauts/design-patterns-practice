package com.observer;

public class MobileObserver implements NotificationObserverInterface{
    String numbers;
    ObservableInterface observableInterface;

    public MobileObserver(String numbers, ObservableInterface observableInterface){
        this.numbers =numbers;
        this.observableInterface=observableInterface;
    }

    @Override
    public void update() {
        sendMessage(numbers,"product is in stock hurry up !!!");
    }
    private void sendMessage(String numbers, String msg){
        System.out.println("number par sent to :"+numbers+" with message "+msg);
    }
}
