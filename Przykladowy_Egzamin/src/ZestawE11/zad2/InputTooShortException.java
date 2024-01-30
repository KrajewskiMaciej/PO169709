package ZestawE11.zad2;

import java.util.InputMismatchException;

public class InputTooShortException extends InputMismatchException {
    @Override
    public String toString(){
        return "Napis za krótki";
    }
}
