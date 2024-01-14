package zad3;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Music m1=new Music("a", "a", 1997);
        Music m2=new Music("h", "l", 1998);
        Music m3=new Music("b", "b", 1999);
        Music m4=new Music("c", "c", 2001);
        ArrayList<Music> MusicList=new ArrayList<Music>(Arrays.asList(m1,m3,m2,m4));
        for(var item:MusicList){
            System.out.println(item);
        }
        MusicList.sort(new MusicComparator().reversed());
        System.out.println("--");
        for(var item:MusicList){
            System.out.println(item);
        }
    }
}