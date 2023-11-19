public class Osoba1 {
    public String imie;
    public static int licznik=0;

    public Osoba1(){
        this("Default");
    }

    public Osoba1(String imie){
        this.imie=imie;
        licznik=licznik+1;
    }

    public int zwrocLicznik(){
        return licznik;
    }
}
