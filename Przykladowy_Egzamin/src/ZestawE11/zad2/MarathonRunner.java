package ZestawE11.zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MarathonRunner implements Comparable<MarathonRunner>{
    String name;
    int raceTime;

    public MarathonRunner(String name, int raceTime){
        this.name=name;
        this.raceTime=raceTime;
    }
    @Override
    public String toString(){
        return "Imie: "+name+". Czas biegu: "+raceTime+".\n";
    }

    @Override
    public int compareTo(MarathonRunner other){
        return Integer.compare(other.raceTime, raceTime);
    }
}

class compareTime implements Comparator<MarathonRunner>{
    public int compare(MarathonRunner o1, MarathonRunner o2){
        int wynik= Integer.compare(o1.raceTime,o2.raceTime);
        return Integer.reverse(wynik);
    }
}

class TestMarathonRunner{
    public static void main(String[] args) {
        ArrayList<MarathonRunner> listaBiegaczy = new ArrayList<>();
        listaBiegaczy.add(new MarathonRunner("Jan", 221));
        listaBiegaczy.add(new MarathonRunner("Karol", 123));
        listaBiegaczy.add(new MarathonRunner("Alojzy", 723));

        System.out.println(listaBiegaczy);
        Collections.sort(listaBiegaczy);

        System.out.println(listaBiegaczy);
    }
}

