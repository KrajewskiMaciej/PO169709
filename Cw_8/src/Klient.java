import java.util.Date;

public class Klient implements Comparable<Klient>{
    String imie;
    int nrKlienta;
    Date ostatnieLogowanie;

    @Override
    public String toString(){
        return "Ostatnie Logowanie: "+ostatnieLogowanie;

    }

    public Klient(Date ostatnieLogowanie){
        this.ostatnieLogowanie=ostatnieLogowanie;
    }

    public int compareTo(Klient other){
        return other.ostatnieLogowanie.compareTo(this.ostatnieLogowanie);
    }
}
