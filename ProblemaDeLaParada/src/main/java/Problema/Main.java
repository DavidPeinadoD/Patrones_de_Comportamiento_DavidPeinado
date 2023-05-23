package Problema;


import Problema.Observer.DefaultHaltObserver;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de HaltChecker
        HaltChecker haltChecker = new HaltChecker();

        // Crear una instancia de Program
        Program program = new Program();

        // Crear una instancia de Input
        Input input = new Input(5000); // Ejemplo de entrada

        // Crear una instancia de DefaultHaltObserver
        DefaultHaltObserver defaultHaltObserver = new DefaultHaltObserver();

        // Agregar el DefaultHaltObserver al HaltChecker
        haltChecker.addObserver(defaultHaltObserver);

        // Realizar la verificación de parada utilizando el HaltChecker
        haltChecker.checkHalt(program, input);

        Reverser reverser = new Reverser(haltChecker);

        reverser.halts(program, input);
    }
}


