package ZestawE11.zad2;

import java.util.Scanner;

public class NewExceptionTest {
    public static void main(String[] args) {
        getValidUserInput();
    }
    static String getValidUserInput(){
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj napis: ");
        String napis = skaner.nextLine();

        if(napis.length()>=4){
            return "OK";
        }else {
            throw new InputTooShortException();
        }
    }
}
