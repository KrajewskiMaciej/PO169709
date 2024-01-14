package zad3;

import java.util.ArrayList;
import java.util.Arrays;

public class Music implements Comparable<Music>{
    String title;
    String artist;
    int releaseYear;

    public Music(String title, String artist, int releaseYear){
        this.title=title;
        this.artist=artist;
        this.releaseYear=releaseYear;
    }
    @Override
    public int compareTo(Music o) {
        return Integer.compare(releaseYear,o.releaseYear);
    }
    public String toString(){
        return ""+releaseYear;
    }

}

