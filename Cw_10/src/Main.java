import java.util.InputMismatchException;

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

    public static void przyklad1() {
        PlanPodrozy plan = new PlanPodrozy(new LotMiedzynarodowy());
        plan.wystawBilet();
        plan = new PlanPodrozy(new Koncert());
        plan.wystawBilet();
        plan = new PlanPodrozy(new BramkaNaAutostradzie());
        plan.wystawBilet();
    }

    public static void zad1() {
        Biuro druk = new Biuro(new StandardowyPrinter());
        druk.drukujDokument();
    }

    public static void zad2() {
        Samochod samochod = new Samochod(new BenzynowySilnik());
        samochod.start();
        samochod.stop();
    }

    public static void zad3() {
        Uzytkownik uzytkownik = new Uzytkownik(new Email());
        uzytkownik.powiadomOModernizacji();
    }

    public static void zad4(){
        try {
            Wiek wiek = new Wiek(20);
            wiek.checkAge();
            Wiek wiek1 = new Wiek(15);
            wiek1.checkAge();
            Wiek wiek2 = new Wiek(25);
            wiek2.checkAge();
        }
        catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static void zad5(){
        try {
            Dzielenie dzielenie = new Dzielenie();
            dzielenie.podziel();
        } catch (InputMismatchException e){
            System.out.println("Błąd: " + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static void zad6(){

    }
}