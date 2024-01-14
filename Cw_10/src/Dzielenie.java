import java.util.InputMismatchException;
import java.util.Scanner;

public class Dzielenie {
    public int a;
    public int b;

    public void dodajLiczby(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
    }
    public void podziel(){

        if(int.TryParse(a) || int.TryParse(b)){
            throw new InputMismatchException("Podana wartosc nie jest liczba.");
        }
        if (b == 0) {
            throw new ArithmeticException("Nie można dzielic przez 0. Podaj inną liczbe.");
        } else {
            System.out.println("Wynik: "+(a/b));
        }
    }
}
