import java.util.Scanner;

public class KontoBankowe {

    public double saldo;

    public double wplac(){
        System.out.println("Podaj kwotę do wplacenia:");
        Scanner skaner = new Scanner(System.in);
        double kwota= skaner.nextDouble();

        return saldo+kwota;
    }
    public double wyplac(){
        System.out.println("Podaj kwotę do wyplacenia: ");
        Scanner skaner = new Scanner(System.in);
        double kwota= skaner.nextDouble();

        return saldo-kwota;

    }
}
