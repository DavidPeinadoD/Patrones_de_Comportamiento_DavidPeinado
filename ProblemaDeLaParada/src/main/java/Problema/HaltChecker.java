package Problema;

import Problema.Observer.HaltObserver;

import java.util.ArrayList;
import java.util.List;

public class HaltChecker {
    private final List<HaltObserver> observers;

    public HaltChecker() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(HaltObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(HaltObserver observer) {
        observers.remove(observer);
    }

    public boolean checkHalt(Program program, Input input) {
        for (HaltObserver observer : observers) {
            if (observer.halts(program, input)) {
                System.out.println("HaltChecker: Se para");
                return true;
            }
        }
        System.out.println("HaltChecker: Nunca");
        return false;
    }
}
