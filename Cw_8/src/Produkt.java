import java.time.LocalDate;

public class Produkt implements Comparable<Produkt>{
    String nazwa;
    double cena;
    LocalDate dataWażności;

    @Override
    public String toString(){
        return "Data: "+dataWażności;
    }

    public Produkt(LocalDate dataWażności){
        this.dataWażności=dataWażności;
    }

    public int compareTo(Produkt other){
        return this.dataWażności.compareTo(other.dataWażności);
    }

}
