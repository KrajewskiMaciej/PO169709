public class Product implements Comparable<Product>{
    int id;
    String name;
    double price;

    @Override
    public String toString(){
        return "Cena: "+price+" ID: "+id+"\n";
    }

    public Product(int id, double price){
        this.id=id;
        this.price=price;
    }

    public int compareTo(Product other){
        int wynik = (int) Math.signum(this.price- other.price);

        if(wynik ==0){
            wynik = (int) Math.signum(this.id- other.id);
        }
        return wynik;
    }
}
