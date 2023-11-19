public class Rectangle {
    private int width;
    private int height;

    //public Rectangle(width,height){

    //}

    public String area(){
        int wynik=width*height;

        return String.format("Pole powierzchni: %d",wynik);
    }



}
