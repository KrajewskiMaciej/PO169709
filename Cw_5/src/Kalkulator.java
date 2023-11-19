public class Kalkulator {

    public int dodaj(int x,int y){
       return x+y;
    }
}
class KalkulatorRozszerzony extends Kalkulator{
    public int dodaj(int x,int y, int z){
        return x+y+z;
    }
}
