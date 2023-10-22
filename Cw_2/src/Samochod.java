public class Samochod {

    public String marka;
    public String model;
    public int predkosc;

    public int przyspiesz(){
        return predkosc+10;
    }
    public int zwolnij(){
        if(predkosc-10>0){
            return predkosc-10;
        }
        else{
            return 0;
        }
    }
}
