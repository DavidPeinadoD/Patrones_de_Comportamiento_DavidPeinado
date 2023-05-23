package Problema;

public class Program {
    public void run(Input input) {
        int num = input.getNum();
        int maxIterations = 1000000; // Número máximo de iteraciones

        for (int i = 0; i < maxIterations; i++) {
            System.out.println(num);
            num = num + 1;
            if (num == 0) {
                break; // Salir del bucle si num es igual a cero

            }
        }
        if (num != 0) {
            throw new RuntimeException();
        }
    }
}