import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
    }

    public static void zad1(){
        StringBuffer tekst=new StringBuffer("witaj swiecie");
        System.out.println(tekst);
        CapitalizeEverySecond(tekst);
        System.out.println(tekst);
    }
    public static void zad2(){
        Student student =new Student("Damian", "Biegajło");

        System.out.println(student.firstName+" "+student.lastName+" ,"+student.fieldOfStudy);
    }
    public static void zad3(){
        Car nowy=new Car("Opel","Astra", 5);
        System.out.println("Brand: " + nowy.getBrand());
        System.out.println("Model: " + nowy.getModel());
        System.out.println("Number of Doors: " + nowy.getNumberOfDoors());
    }
    public static void zad4(){
        int[] lista1={1,2,3};
        int[] lista2={4,5,6};
        List<Integer> mergeList =mergeArrays(lista1,lista2);
        System.out.println(mergeList);
    }
    public static void zad5(){
        Settings wlasne = new Settings("2.0", "Spanish");
        System.out.println("Własne Ustawienia: Version = " + wlasne.getVersion() + ", Language = " + wlasne.getLanguage());

        Settings domyslne = Settings.defaultSettings();
        System.out.println("Domyslne Ustawienia: Version = " + domyslne.getVersion() + ", Language = " + domyslne.getLanguage());

        wlasne.setVersion("3.0");
        wlasne.setLanguage("French");
        System.out.println("Zaktualizowane Wlasne Ustawienia: Version = " + wlasne.getVersion() + ", Language = " + wlasne.getLanguage());
}

    public static void CapitalizeEverySecond(StringBuffer napis){
        if(napis == null || napis.length() <2){
            return;
        }

        for( int i=1; i<napis.length(); i+=2){
            char obecnyZnak= napis.charAt(i);
            char powiekszZnak = Character.toUpperCase(obecnyZnak);
            napis.setCharAt(i, powiekszZnak);
        }

    }
    public static List<Integer> mergeArrays(int[] array1, int[] array2) {
        List<Integer> polaczaone = new ArrayList<>();
        for (int num : array1) {
            polaczaone.add(num);
        }
        for (int num : array2) {
            polaczaone.add(num);
        }
        return polaczaone;
    }
}