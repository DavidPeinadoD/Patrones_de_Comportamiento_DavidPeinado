package Problema.Observer;

import Problema.Input;
import Problema.Program;

public interface HaltObserver {
    boolean halts(Program program, Input input);
}
