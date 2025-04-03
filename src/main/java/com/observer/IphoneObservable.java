package com.observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements ObservableInterface {
    List<NotificationObserverInterface> observerInterfaceList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationObserverInterface observerInterface) {
        observerInterfaceList.add(observerInterface);
    }

    @Override
    public void remove(NotificationObserverInterface observerInterface) {
        observerInterfaceList.remove(observerInterface);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationObserverInterface observerInterface : observerInterfaceList) {
            observerInterface.update();
        }
    }

    @Override
    public void setData(int count) {
        if (count == 0) {
            notifySubscribers();
        }
        stockCount += count;
    }

    @Override
    public int getData() {
        return stockCount;
    }
}
