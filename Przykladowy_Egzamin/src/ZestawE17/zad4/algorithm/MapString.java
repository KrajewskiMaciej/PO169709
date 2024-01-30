package ZestawE17.zad4.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MapString {
    public static <K, V> String mapToString(HashMap<K, V> map){
        if(map == null){
            throw new IllegalArgumentException("Mapa jest null");
        }

        StringBuilder wynik = new StringBuilder();
        for(Map.Entry<K, V> entry : map.entrySet()){
            wynik.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");


        }
        if(!map.isEmpty()){
            wynik.setLength(wynik.length()-2);
        }

        return wynik.toString();
    }

    public static void main(String[] args) {
        HashMap<Person, Integer> mapaLudzi = new HashMap<>();
        mapaLudzi.put(new Person("Adam"),30);
        mapaLudzi.put(new Person("Jan"),25);
        mapaLudzi.put(new Person("Marek"),35);

        String wynik = mapToString(mapaLudzi);

        System.out.println(wynik);
    }
}
