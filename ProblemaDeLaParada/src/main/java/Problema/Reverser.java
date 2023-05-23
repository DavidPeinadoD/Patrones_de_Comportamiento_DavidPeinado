package Problema;

import Problema.Observer.HaltObserver;

public class Reverser implements HaltObserver {
    private HaltChecker haltChecker;

    public Reverser(HaltChecker haltChecker) {
        this.haltChecker = haltChecker;
    }

    @Override
    public boolean halts(Program program, Input input) {
            if (haltChecker.checkHalt(program, input)==true){
                System.out.println("Reverser: Bucle Infinito");
                do {

                }while (false);
            }else{
                System.out.println("Reverser: Se para");
            }

        return false;
    }
}

