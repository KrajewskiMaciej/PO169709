import java.time.LocalDate;

public class Osoba implements Comparable<Osoba>{
    String imie;
    int wzrost;
    LocalDate dataUrodzenia;

    @Override
    public String toString(){
        return "Wzrost: "+wzrost;
    }

    public Osoba(int wzrost){
        this.wzrost=wzrost;
    }

    public int compareTo(Osoba other){
        return (int) Math.signum(this.wzrost- other.wzrost);
    }
}
