package Problema.AbstractFactory;

import Problema.HaltChecker;

public class DefaultHaltCheckerFactory implements HaltCheckerFactory {
    @Override
    public HaltChecker createHaltChecker() {
        return new HaltChecker();
    }
}
