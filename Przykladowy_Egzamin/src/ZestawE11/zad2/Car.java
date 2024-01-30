package ZestawE11.zad2;
import java.util.ArrayList;
import java.util.Collections;
public class Car implements Comparable<Car>{
    String brand;
    int mileage;
    int yearOfProduction;

    public Car(String brand, int mileage, int yearOfProduction){
        this.brand=brand;
        this.mileage=mileage;
        this.yearOfProduction=yearOfProduction;
    }
    @Override
    public String toString(){
        return brand+" Przebieg: "+mileage+" Rok Produkcji: "+yearOfProduction+"\n";
    }
    @Override
    public int compareTo(Car other){
        int wynik= Integer.compare(this.mileage, other.mileage);
        if(wynik==0){
            wynik= Integer.compare(this.yearOfProduction, other.yearOfProduction);
        }
        return wynik;
    }
}

class TestCar {
    public static void main(String[] args) {
        ArrayList<Car> sam = new ArrayList<>();
        sam.add(new Car("BMW",405237,2017));
        sam.add(new Car("Audi",223741,2012));
        sam.add(new Car("Citroen",405237,2009));

        System.out.println(sam);
        Collections.sort(sam);
        System.out.println(sam);
    }
}
