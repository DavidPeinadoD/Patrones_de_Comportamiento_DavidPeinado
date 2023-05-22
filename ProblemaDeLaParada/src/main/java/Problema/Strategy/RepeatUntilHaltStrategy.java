package Problema.Strategy;

public class RepeatUntilHaltStrategy implements HaltStrategy {
    @Override
    public boolean checkHalt(String programCode, String input) {
        // Implementar lógica para determinar si el programa se detiene con la entrada dada
        // y retornar true si se detiene, o false si no se detiene (bucle infinito)
        return false;
    }
}