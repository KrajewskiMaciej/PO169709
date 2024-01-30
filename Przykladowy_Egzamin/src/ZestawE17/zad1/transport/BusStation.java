package ZestawE17.zad1.transport;

import javax.crypto.Cipher;
import java.util.ArrayList;

public class BusStation {
    private String name;
    private String city;
    private ArrayList<String> buses;

    public BusStation(String name,String city){
        this.name=name;
        this.city=city;
        this.buses = new ArrayList<>();
    }

    public void addBus(String bus){
        buses.add(bus);
    }

    public void removeBus(String bus){
        buses.remove(bus);
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return name+": "+ city+"\n"+getBuses();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public ArrayList<String> getBuses() {
        return buses;
    }

}
