package com.observer;

public interface ObservableInterface {

   void add(NotificationObserverInterface observerInterface);

    void remove(NotificationObserverInterface observerInterface);

    void notifySubscribers();
    void setData(int count);
    int getData();
}
