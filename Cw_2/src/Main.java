import java.time.LocalTime;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Random random = new Random();

    public static void zad1(){
        ArrayList<Integer> listaliczb = new ArrayList<>();

        for(int i=0;i<10;i++){
            listaliczb.add(random.nextInt(21));
        }
        Integer[] tablica = {1,2,3,4,5};
        //ArrayList<Integer> tablica2= (ArrayList<Integer>) Arrays.asList(tablica);
        System.out.println(listaliczb);
        odwrocArrayList(listaliczb);
        Collections.reverse(listaliczb);
    }

    public static void zad2(){
        ArrayList<Double> lista = new ArrayList<>();

        for(int i=0;i<10;i++){
            lista.add(random.nextDouble(100));
        }
        System.out.println(lista);
        average(lista);

    }

    public static void zad3(){
        ArrayList<Integer> listaliczb = new ArrayList<>();

        for(int i=0;i<10;i++){
            listaliczb.add(random.nextInt(6));
        }
        System.out.println(listaliczb);
        countZeros(listaliczb);

    }

    public static void zad4(){
        System.out.println("Podaj napis:");
        Scanner skaner = new Scanner(System.in);
        String napis = skaner.nextLine();

        usunpowtarzajace(napis);

    }

    public static void zad5(){
        System.out.println("Podaj napis:");
        Scanner skaner = new Scanner(System.in);
        String sb2 = skaner.nextLine();

        String nowy = new String(reverseString(new StringBuilder(sb2)));

        System.out.println(nowy);

    }
    public static void dom(){
        House domStefana = new House();
        domStefana.area = 150;
        domStefana.garage =true;
        domStefana.rooms = 6;
        domStefana.garden = false;
        domStefana.floors = 2;
        System.out.println(domStefana.getPrice());

        House domSylwii = new House();
        domSylwii.area= 175;
        domSylwii.garage = false;
        domSylwii.rooms = 4;
        domSylwii.garden = true;
        domSylwii.floors = 2;
        System.out.println(domSylwii.getPrice());

    }

    public static void psy(){
        Pies pies1 = new Pies();
        pies1.nazwa="Azor";
        pies1.rasa="Owczarek Niemiecki";
        pies1.wiek=5;

        System.out.println(pies1.dajGlos());

    }

    public static void wyscigi(){
        Samochod s1 = new Samochod();
        s1.marka="Ford";
        s1.model="Mondeo";
        s1.predkosc=5;

        System.out.println(s1.predkosc);
        s1.predkosc=s1.zwolnij();
        System.out.println(s1.predkosc);
        s1.predkosc=s1.przyspiesz();
        System.out.println(s1.predkosc);
        s1.predkosc=s1.przyspiesz();
        System.out.println(s1.predkosc);
    }

    public static void bankomat(){
        KontoBankowe mojeKonto=new KontoBankowe();
        mojeKonto.saldo=1254.37;


        System.out.println("Stan konta: "+mojeKonto.saldo+" zł.");
        mojeKonto.saldo= mojeKonto.wplac();
        System.out.println("Stan konta: "+mojeKonto.saldo+" zł.");
        mojeKonto.saldo= mojeKonto.wyplac();
        System.out.println("Stan konta: "+mojeKonto.saldo+" zł.");

    }
    public static void pd1(){
        Point p1=new Point(1228,25);
        Point p2=new Point(23,5);

        double distance = p1.distance(p2);
        System.out.println("Odległość między punktem 1 a punktem 2: " + distance);
    }

    public static void pd2(){
        Time time = new Time(4, 15);
        LocalTime systemTime = LocalTime.now();
        Time currentTime = new Time(systemTime);

        Time resultTime = time.addTime(currentTime);

        System.out.println("Suma czasów: " + resultTime.getHours() + " h " + resultTime.getMinutes() + " m");
    }

    public static void pd3(){
        Car c1=new Car();
        c1.brand="";

        if(c1.brand==""){
                System.out.println("Nie wprowadzono marki samochodu!!");
            }
        else {
                System.out.println("Marka samochodu:" + c1.brand);
            }
    }

    public static void pd4(){
        Osoba osoba1=new Osoba("Anna");
        Osoba osoba2=osoba1;

        System.out.println("Początkowa wartośc pola osoba2:"+osoba2.imie);

        osoba1.imie="Maria";

        System.out.println("Zmieniona wartość pola osoba1:"+osoba2.imie);
    }

    public static void pd5(){
        Samochod[] samochody = new Samochod[3];

        if(samochody[0]!=null){
            String markaSamochodu = samochody[0].marka;
            System.out.println("Marka samochodu:" + markaSamochodu);

        }
        else {
            System.out.println("Pusta tablica. Nie można wyświetlić obiektów!!");
        }
    }

    public static void pd6(){
        ArrayList<Osoba> listaOsob = new ArrayList<Osoba>();

        if (!listaOsob.isEmpty()) {
            String imieOsoby = listaOsob.get(0).imie;
            System.out.println("Imię osoby: " + imieOsoby);
        } else {
            System.out.println("Lista osób jest pusta.");
        }

    }
    public static void main(String[] args) {

        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        dom();
        psy();
        wyscigi();
        bankomat();

        pd1();
        pd2();
        pd3();
        pd4();
        pd5();
        pd6();
    }

    public static void odwrocArrayList(ArrayList<Integer> lista){
        for(int i=lista.size()-1;i>=0;i--){
            System.out.print(lista.get(i)+" ");
        }
    }

    public static void average(ArrayList<Double> lista){
        double  suma=0;
        for(int i=lista.size()-1;i>=0;i--){
            suma+=lista.get(i);
        }
        double wynik=suma/lista.size();

        System.out.println("Średnia arytmetyczna wszystkich liczb: "+wynik);
    }

    public static void countZeros(ArrayList<Integer> lista){
        int wynik=0;
        if (lista.isEmpty()){
            for(int i=lista.size()-1;i>=0;i--){
            if(lista.get(i)==0){
                wynik++;
                }
            }
        }
        else {
            wynik=wynik;
        }
        System.out.println("Ilość wystąpień zera w tablicy: "+wynik);

    }

    public static void usunpowtarzajace(String napis){
        var set = new HashSet<Character>();
        var size = napis.length();
        var builder = new StringBuilder(size);

        for(int i=0; i<size;i++){
            char c=napis.charAt(i);
            if(!set.contains(c)){
                builder.append(c);
                set.add(c);
            }
        }

        System.out.println("Napis bez powtórzeń: "+builder);

    }

    public static StringBuilder reverseString(StringBuilder sb2){
        StringBuilder revSb2 = new StringBuilder((sb2.reverse()));
        return revSb2;

    }

}