// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //przyklad1();
        //zad1();
        //zad2();
        //zad3();
        //zad4();
        //zad5();
        zad6();
    }

    public static void przyklad1(){
        Cat kot = new Cat();
        kot.makeSound();

        Animal zwierze = kot;
    }

    public static void zad1(){
        Employee osoba =new Employee();

        osoba.displayData();
    }

    public static void zad2(){
        Hammer mlotek=new Hammer("Makita");

        String nazwa = mlotek.nazwa;
        System.out.println(nazwa);
    }

    public static void zad3(){
        Samochod nowy=new Samochod();

        nowy.jedz();
    }

    public static void zad4(){
        Kalkulator licz=new Kalkulator();

        System.out.println(licz.dodaj(12,23));

        KalkulatorRozszerzony policz=new KalkulatorRozszerzony();
        System.out.println(policz.dodaj(12,31,2));
    }

    public static void zad5(){
        Komputer komp=new Komputer();
        komp.uruchom();

        Laptop lap=new Laptop();
        lap.uruchom();
    }

    public static void zad6(){
        Programista nowy=new Programista();


    }
}
