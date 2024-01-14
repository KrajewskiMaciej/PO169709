// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    static <T> boolean isEqual(T a, T b){
        return a.equals(b);
    }
    static <T> void swap(T[] Array, int a, int b){
        if(a<Array.length&&b<Array.length){
            T storedA=Array[a];
            Array[a]=Array[b];
            Array[b]=storedA;
        }
        else System.out.println("Poza zasięgiem");
    }
    static <T extends Comparable<T>> T minValue(T[] array){
        if(array.length ==0) throw new IllegalArgumentException();
        T min=array[0];

        for(int i=0;i<array.length;i++){
            if(min.compareTo(array[i])>0){
                min=array[i];
            }
        }
        return min;
    }
}