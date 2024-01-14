package zad4;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Date data=new Date(53, 1, 12);
        VideoGame game=new VideoGame("CS2", "FPS", data);
        System.out.println(game.toString());

        try {
            VideoGame otherGame=(VideoGame) game.clone();
            Date oData = new Date(133,2,4);
            game.setReleaseDate(oData);
            System.out.println(game.toString());
            System.out.println(otherGame.toString());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
