package ZestawE16.zad1;

public class TestHotel {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel(null,-2423);
        Hotel hotel2;

        try{
            hotel2 = (Hotel) hotel1.clone();
            hotel1.setName("Wilczy Szaniec");
            System.out.println(hotel1);
            System.out.println(hotel2);
        }
        catch (CloneNotSupportedException e){
            throw new RuntimeException();

        }
    }
}
