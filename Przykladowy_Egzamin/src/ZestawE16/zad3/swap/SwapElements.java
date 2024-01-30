package ZestawE16.zad3.swap;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;

public class SwapElements {
    public static <T> void swapElements(T[] array, int index1, int index2) {
        if(array == null || index1 <0 || index1 >=array.length ||index2 <0 || index2 >=array.length ){
           throw new IllegalArgumentException("Nieprawidłowe wartości do zamiany");
        }
        T tmp = array[index1];
        array[index1]=array[index2];
        array[index2]=tmp;
    }
}

class VideoGame{
    String name;
    String developer;
    float rating;

    public VideoGame(String name, String developer, float rating){
        this.name=name;
        this.developer=developer;
        this.rating=rating;
    }

    @Override
    public String toString(){
        return name+", "+developer+", "+rating+"\n";
    }

}

class TestVideoGame{
    public static void main(String[] args) {
        VideoGame[] gry = {
                new VideoGame("Gra1","Deweloper1",5.1f),
                new VideoGame("Gra2","Deweloper2",2.1f),
                new VideoGame("Gra3","Deweloper3",9.1f)
        };

        System.out.println(Arrays.toString(gry));
        SwapElements.swapElements(gry, 1, 2);
        System.out.println(Arrays.toString(gry));
    }
}