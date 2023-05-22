package Problema.Observer;

import Problema.Input;
import Problema.Program;


public class DefaultHaltObserver implements HaltObserver {
    @Override
    public boolean halts(Program program, Input input) {
        try {
            program.run(input);
            return true; // Si el programa se ejecuta sin lanzar una excepción, se considera que se detiene
        } catch (Exception e) {
            return false; // Si el programa lanza una excepción, se considera que no se detiene
        }
    }
}
