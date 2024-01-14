package zad3;

import java.util.Comparator;
public class MusicComparator implements Comparator<Music>{
    @Override
    public int compare(Music o1, Music o2){
        return Integer.compare(o1.releaseYear, o2.releaseYear);
    }
}
