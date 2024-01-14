package zad4;

import java.util.Date;

public class VideoGame {
    String title;
    String genre;
    Date releaseDate;

    public VideoGame(String title, String genre, Date releaseDate){
        this.title=title;
        this.genre=genre;
        this.releaseDate=releaseDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return title+" "+genre+" "+releaseDate;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public Date getReleaseDate(){
        return releaseDate;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setReleaseDate(Date releaseDate){
        this.releaseDate=releaseDate;
    }
}
