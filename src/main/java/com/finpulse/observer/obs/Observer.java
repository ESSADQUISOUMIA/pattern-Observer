package com.finpulse.observer.obs;

@FunctionalInterface
public interface Observer {

    void update(Observable o);
}