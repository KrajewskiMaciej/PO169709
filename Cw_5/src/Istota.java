public class Istota {
    public Istota(){
        System.out.println("WYkonuje się Istota");
    }
}

class Czlowiek extends Istota{
    public Czlowiek(){
        System.out.println("Wykonuje się Czlowiek");
    }

}
class Programista extends Czlowiek{
    public Programista(){
        System.out.println("Wykonuje się Programista");
    }
}
