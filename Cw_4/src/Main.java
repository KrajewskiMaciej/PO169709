// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //zad1();
        //zad2();
        zad3();
    }

    public static void zad1(){
        Person osoba=new Person("Daniel","",14);

        System.out.println(osoba.toString());
    }
    public static void zad2(){
        Vehicle nowy1=new Vehicle("Tesla","S",2234);
        Vehicle nowy2=new Vehicle("Tesla","X",2234);

        System.out.println(nowy1.toString());
        System.out.println(nowy1.equals(nowy2));
    }
    public static void zad3(){
        Rectangle nowy=new Rectangle();

        System.out.println(nowy);
    }
}