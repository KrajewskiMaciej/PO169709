public class Samochód implements Comparable<Samochód>{
    String marka;
    int rokProdukcji;
    double cena;

    @Override
    public String toString(){
        return "Rok: "+rokProdukcji;
    }

    public Samochód(int rokProdukcji){
        this.rokProdukcji=rokProdukcji;
    }

    public int compareTo(Samochód other){
        return (int) Math.signum(this.rokProdukcji-other.rokProdukcji);
    }
}
