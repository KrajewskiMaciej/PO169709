import java.time.LocalDate;

public class Pracownik implements Comparable<Pracownik>{
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    @Override
    public String toString(){
        return ""+pensja;
    }

    public Pracownik(double pensja){
        this.pensja=pensja;
        this.imie="default";
    }

    public int compareTo(Pracownik other){
        return (int) Math.signum(this.pensja- other.pensja);
    }


}
