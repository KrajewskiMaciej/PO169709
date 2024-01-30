package ZestawE17.zad3.finding;

public class FindingNonNull {
    public static <T> T findFirstNonNull(T[] tab){
        for(T element : tab){
            if(element != null){
                return element;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String[] tablica={null,null,"Hello", "World", null, "Witaj", "Świecie"};

        String wynik = findFirstNonNull(tablica);

        if(wynik != null){
            System.out.println("Pierwszy element, który nie jest nullem: "+wynik);
        } else {
            System.out.println("Wszystkie elementy są null");
        }
    }
}
