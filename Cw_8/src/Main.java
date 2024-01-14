import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Pracownik> prac = new ArrayList<>();
        prac.add(new Pracownik(12000));
        prac.add(new Pracownik(5600));
        prac.add(new Pracownik(7900));
        prac.add(new Pracownik(25000));
        prac.add(new Pracownik(4200));

        System.out.println(prac);
        Collections.sort(prac);
        System.out.println(prac);

        ArrayList<Klient> kli = new ArrayList<>();
        kli.add(new Klient(new Date(2023, 12,23)));
        kli.add(new Klient(new Date(2024, 1,13)));
        kli.add(new Klient(new Date(2023, 1,5)));
        kli.add(new Klient(new Date(2000, 1,14)));
        kli.add(new Klient(new Date(2022, 9,12)));
        System.out.println(kli);
        Collections.sort(kli);
        System.out.println(kli);

        ArrayList<Osoba> os = new ArrayList<>();
        os.add(new Osoba(163));
        os.add(new Osoba(197));
        os.add(new Osoba(176));
        os.add(new Osoba(181));
        os.add(new Osoba(112));
        System.out.println(os);
        Collections.sort(os);
        System.out.println(os);

        ArrayList<Student> stud = new ArrayList<>();
        stud.add(new Student(3.14,3));
        stud.add(new Student(4.50,2));
        stud.add(new Student(3.14,1));
        stud.add(new Student(5.00,5));

        System.out.println(stud);
        Collections.sort(stud);
        System.out.println(stud);

        ArrayList<Produkt> prod = new ArrayList<>();
        prod.add(new Produkt(LocalDate.of(2024,1,25)));
        prod.add(new Produkt(LocalDate.of(2024,1,18)));
        prod.add(new Produkt(LocalDate.of(2024,1,20)));
        prod.add(new Produkt(LocalDate.of(2024,1,15)));
        prod.add(new Produkt(LocalDate.of(2024,1,19)));

        System.out.println(prod);
        Collections.sort(prod);
        System.out.println(prod);

        ArrayList<Samochód> sam = new ArrayList<>();
        sam.add(new Samochód(1999));
        sam.add(new Samochód(2023));
        sam.add(new Samochód(2001));
        sam.add(new Samochód(2009));
        sam.add(new Samochód(2015));

        System.out.println(sam);
        Collections.sort(sam);
        System.out.println(sam);

        ArrayList<Product> prdc = new ArrayList<>();
        prdc.add(new Product(2,5.55));
        prdc.add(new Product(1,2.19));
        prdc.add(new Product(7,3.33));
        prdc.add(new Product(3,5.59));
        prdc.add(new Product(9,5.55));

        System.out.println(prdc);
        Collections.sort(prdc);
        System.out.println(prdc);

        Teacher nauczyciel = new Teacher(5);

        Teacher klonNauczyciela = nauczyciel.clone();

        nauczyciel.setExperience(3);

        System.out.println(nauczyciel);
        System.out.println(klonNauczyciela);

    }
}