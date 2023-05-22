package Problema.AbstractFactory;

import Problema.Observer.DefaultHaltObserver;
import Problema.Observer.HaltObserver;

public interface HaltObserverFactory {
     HaltObserver createHaltObserver();
}
