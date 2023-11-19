import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //zad1();
        //zad2();
        //zad3();
        //zad4();
        //zad5();
        //zad6();
        //zad7();
        //zad8();
        zad9();
    }

    public static void zad1(){
        Ksiazka k1=new Ksiazka();
        k1.rokWydania=2000;
        k1.tytul="Harry Potter 1";
        k1.autor="JKR";
        Ksiazka k2=new Ksiazka("Pani Jeziora","Andrzej Sapkowski",1999);

        System.out.println(k2.autor);
        Ksiazka k3=new Ksiazka();
        System.out.println(k3.rokWydania);
    }

    public static void zad2(){
        Samochod s1=new Samochod("Alfa Romeo","Gulia",2023);

        System.out.println(s1.model);
    }

    public static void zad3(){
        Osoba o1=new Osoba("Jan","Kowalski");

        System.out.println(o1.imie+" "+o1.nazwisko+" "+o1.wiek);
    }
    public static void zad4(){
        Kwadrat k1=new Kwadrat();
        System.out.println(k1.bok);
    }

    public static void zad5(){
        Student s1=new Student("Jan","Kowalski");

        System.out.println(s1.kierunekStudiow);
    }

    public static void zad6(){
        Osoba1 o1 = new Osoba1();
        System.out.println(o1.zwrocLicznik());
        Osoba1 o2=new Osoba1();
        System.out.println(o1.zwrocLicznik());
    }
    public static void zad7(){
        /*Matematyka m1=new Matematyka();

        System.out.println(m1.PI);*/
    }

    public static void zad8() {
        Singleton s1=new Singleton();

        System.out.println(Singleton.getInstance());
    }

    public static void zad9(){

    }

}