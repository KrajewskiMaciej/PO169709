import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void zad1(){
        //Napisz prostą aplikację kalkulatora tekstowego,
        // która przyjmuje dwa liczby od użytkownika jako wejście
        // i wykonuje podstawowe operacje matematyczne (dodawanie, odejmowanie, mnożenie, dzielenie).
        // Wyświetl wyniki na ekranie.
        System.out.print("Podaj pierwszą liczbę: ");
        Scanner scanner = new Scanner(System.in);
        double l1 = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double l2 = scanner.nextDouble();

        System.out.println("Wynik dodawania: " + (l1+l2));
        System.out.println("Wynik odejmowania: " + (l1-l2));
        System.out.println("Wynik mnożenia: " + (l1*l2));
        System.out.println("Wynik dzielenia: " + (l1/l2));

    }
    public static void zad2(){
        //Napisz program, który wczytuje ze standardowego wejścia dwa łańcuchy znaków,
        // a następnie wypisuje je w kolejnych wierszach na standardowym wyjściu.
        System.out.print("Podaj pierwszy łańcuch znaków:");
        Scanner scanner =new Scanner(System.in);
        String z1 = scanner.nextLine();
        System.out.print("Podaj drugi łańcuch znaków:");
        String z2 = scanner.nextLine();

        System.out.println(z1);
        System.out.println(z2);


    }
    public static void zad3(){
        //Napisz program, który wczytuje ze standardowego wejścia cztery liczby wymierne,
        // a następnie wypisuje ich sumę na standardowym wyjściu.
        double suma=0;
        for(int i=1;i<5;i++) {
            System.out.println("Podaj liczbę wymierną nr" + i + ":");
            Scanner scanner = new Scanner(System.in);
            double liczba = scanner.nextDouble();
            suma+=liczba;
        }

        System.out.println("Suma czterech liczb wynosi: "+suma);

    }

    public static void zad4(){
        //Napisz program, który przyjmuje trzy liczby całkowite jako argumenty
        // i zwraca największą z nich. Zastosuj instrukcje warunkowe do porównania liczb.

        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        Scanner scanner = new Scanner(System.in);
        int l1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą: ");
        int l2 = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę całkowitą: ");
        int l3 = scanner.nextInt();

        if(l1>l2 && l1>l3){
            System.out.println("Liczba "+ l1 + " jest największa");
        }
        else if(l3>l1 && l3>l2){
            System.out.println("Liczba "+ l3 + " jest największa");
        }
        else{
            System.out.println("Liczba "+ l2 + " jest największa");
        }

    }

    public static void zad5(){
        //Napisz program, który na podstawie podanego jako argument numeru dnia tygodnia (od 1 do 7) wypisze nazwę tego dnia tygodnia.
        // Dla przykładu, jeżeli użytkownik poda liczbę 1, program powinien wypisać “Poniedziałek”.
        // Jeżeli podana liczba nie jest z zakresu od 1 do 7,
        // program powinien wyświetlić komunikat “Niepoprawny numer dnia tygodnia”.

        System.out.println("Podaj numer dnia tygodnia z zakresu 1-7: ");
        Scanner skaner = new Scanner(System.in);
        int dzien = skaner.nextInt();

        switch(dzien){
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("PIĄTEK");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Niepoprawny numer dnia tygodnia");

        }

    }

    public static void zad6(){
        //Napisz program, który będzie sprawdzał, czy podany rok jest rokiem przestępnym.
        // Rok jest przestępny, jeśli jest podzielny przez 4, ale nie jest podzielny przez 100,
        // chyba że jest podzielny przez 400
        System.out.println("Podaj rok: ");
        Scanner skaner = new Scanner(System.in);
        int rok = skaner.nextInt();

        if(rok%100==0){
                if (rok % 400 == 0) {
                    System.out.println("Podany rok jest przestępny.");
                }
                else{
                    System.out.println("Podany rok nie jest przestępny.");
            }
        }
        else if(rok%4==0){
            System.out.println("Podany rok jest przestępny.");
        }
        else{
            System.out.println("Podany rok nie jest przestępny.");
        }


    }
    public static void zad7(){
        //Napisz program, który oblicza sumę cyfr dowolnej wprowadzonej liczby.
        // Program powinien akceptować liczbę jako input od użytkownika.

        System.out.print("Podaj liczbę: ");
        Scanner skaner= new Scanner(System.in);
        int liczba = skaner.nextInt();

        int suma =0;
        int cyfra=liczba;

        while (cyfra !=0) {
            suma+= cyfra%10;
            cyfra/=10;
        }

        System.out.println("Suma cyfr liczby "+liczba+" wynosi: "+suma);

    }
    public static void zad8(){
        //Napisz program, który tworzy tablicę jednowymiarową 10 liczb całkowitych,
        // a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia.

        int[] tablica = new int[10];
        Scanner scanner=new Scanner(System.in);

        // Wprowadzenie liczb do tablicy
        for (int i=0;i<10;i++) {
            System.out.print("Podaj liczbę " +(i+1)+ ": ");
            tablica[i] =scanner.nextInt();
        }

        System.out.println("Liczby w odwrotnej kolejności:");

        for (int i=9;i>=0;i--) {
            System.out.printf(tablica[i]+",");
        }

    }
    public static void zad9(){
        //Napisz program, który przyjmuje napis jako wejście
        // i wypisuje wszystkie znaki znajdujące się na parzystych indeksach napisu, używając metody charAt.

        System.out.print("Podaj napis: ");
        Scanner scanner = new Scanner(System.in);
        String napis =scanner.nextLine();

        System.out.println("Znaki na parzystych indeksach:");
        for (int i=0;i<napis.length();i+=2) {
            char znak= napis.charAt(i);
            System.out.printf(znak+",");
        }

    }
    public static void zad10(){
        //Napisz program, który przyjmuje jako wejście pojedynczy znak oraz liczbę całkowitą n.
        // Używając klasy StringBuilder, zbuduj i wypisz piramidę o wysokości n,
        // gdzie każdy poziom piramidy składa się z podanego znaku.

        System.out.print("Podaj znak: ");
        Scanner scanner = new Scanner(System.in);
        char znak = scanner.next().charAt(0);

        System.out.print("Podaj wysokość piramidy (liczba całkowita): ");
        int n = scanner.nextInt();

        if (n<=0) {
            System.out.println("Wysokość piramidy musi być liczbą dodatnią.");
        } else {
            StringBuilder piramida= new StringBuilder();

            for (int i=1;i<=n;i++) {
                for (int j=0;j<n-i;j++) {
                    piramida.append(" ");
                }
                for (int k=0;k<2*i-1;k++) {
                    piramida.append(znak);
                }
                piramida.append("\n");
            }

            System.out.println(piramida);
        }

    }
    public static void zad11(){
        //Stwórz program, który przyjmie od użytkownika liczbę całkowitą i zwróci tę liczbę w odwrotnej kolejności.
        // Na przykład, dla liczby 12345, wynik powinien wynosić 54321.
        // Możesz ograniczyć program tylko do liczb dodatnich.

        System.out.println("Podaj liczbę całkowitą: ");
        Scanner skaner= new Scanner(System.in);
        int liczba= skaner.nextInt();
        int wynik=0;

        if(liczba<0){
            liczba*=-1;
            while (liczba !=0) {
                int cyfra = liczba % 10;
                wynik=wynik*10+cyfra;
                liczba/=10;
            }
            wynik*=-1;

        }
        else {
            while (liczba !=0) {
                int cyfra = liczba % 10;
                wynik=wynik*10+cyfra;
                liczba/=10;
            }

        }
        System.out.print("Liczba w odwrotnej kolejności:"+wynik);

    }
    public static void main(String[] args) {

        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
        zad8();
        zad9();
        zad10();
        zad11();

        //
    }
}