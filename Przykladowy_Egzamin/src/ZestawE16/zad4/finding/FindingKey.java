package ZestawE16.zad4.finding;

import java.util.HashMap;
import java.util.SortedMap;

public class FindingKey {
    public static <K, V> V findValueByKey(HashMap<K, V> map, K key){
        if(map==null || key==null){
            throw new IllegalArgumentException("Mapa lub klucz nie istnieją lub są null");
        }
        return map.get(key);
    }
    public static void main(String[] args) {
        HashMap<String, Integer> numMap = new HashMap<>();
        numMap.put("Jeden",1);
        numMap.put("Dwa",2);
        numMap.put("Trzy",3);

        String findKey = "Dwa";
        Integer wynik = findValueByKey(numMap, findKey);

        if(wynik != null){
            System.out.println(findKey+" "+wynik);
        }
        else{
            System.out.println("Klucz nie istnieje w mapie");
        }
    }
}


