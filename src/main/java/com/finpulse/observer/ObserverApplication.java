package com.finpulse.observer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

    public static void main(String[] args) {
        ObservableImp observable = new ObservableImp();
        Observer o1 = new ObserverImp1();
        Observer o2 = new ObserverImp2();
        observable.subscribe(o1);
        observable.subscribe(o2);
        /*observable.subscribe(new Observer() {
            @Override
            public void update(int newState) {
                System.out.println("************ Observer 3*****************");
                System.out.println("New state = "+newState);
            }
        });*/
        /*observable.subscribe(newState -> {
            System.out.println("************ Observer 4*****************");
            System.out.println("New state = "+newState);
        });*/

        observable.setState(3);
        observable.setState(79);
    }
}

