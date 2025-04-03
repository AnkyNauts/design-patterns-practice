package com.observer;

public class Store {
    public static void main(String[] args) {
        ObservableInterface iphoneobservable= new IphoneObservable();
        NotificationObserverInterface observerInterface= new EmailObserver("anky.com",iphoneobservable);
        NotificationObserverInterface observerInterface2=new EmailObserver("abc.con",iphoneobservable);
        NotificationObserverInterface observerInterface1= new MobileObserver("abc_xyz",iphoneobservable);


        iphoneobservable.add(observerInterface);
        iphoneobservable.add(observerInterface1);
        iphoneobservable.add(observerInterface2);

        iphoneobservable.setData(10);
        iphoneobservable.setData(1110);
        iphoneobservable.setData(1000);
    }
}
