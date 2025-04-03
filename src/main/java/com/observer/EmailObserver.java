package com.observer;

public class EmailObserver implements NotificationObserverInterface{
    String emailIds;
    ObservableInterface observableInterface;

    public EmailObserver(String emailIds,ObservableInterface observableInterface){
        this.emailIds=emailIds;
        this.observableInterface=observableInterface;
    }

    @Override
    public void update() {
        sendEmail(emailIds,"product is in stock hurry up !!!");
    }
    private void sendEmail(String email, String msg){
        System.out.println("email sent to :"+email+" with message "+msg);
    }
}
