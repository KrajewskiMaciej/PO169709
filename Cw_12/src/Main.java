import zad1.Person;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person nowy=new Person("Jan", -23);

        System.out.println(nowy.imie()+" "+nowy.wiek());
    }
}