package Problema;

import Problema.Observer.HaltObserver;

public class Reverser implements HaltObserver {
    private HaltChecker haltChecker;

    public Reverser(HaltChecker haltChecker) {
        this.haltChecker = haltChecker;
    }

    @Override
    public boolean halts(Program program, Input input) {
            if (true){
                System.out.println("Reverser: Bucle Infinito");
                do {

                }while (true);
            }else{
                System.out.println("Se para");
            }

        return false;
    }
}

