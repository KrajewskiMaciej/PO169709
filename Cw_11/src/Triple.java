public class Triple <T, U, V>{
    T First;
    U Secont;
    V Third;

    public T getFirst(){
        return First;
    }
    public U getSecont(){
        return Secont;
    }
    public V getThird(){
        return Third;
    }

    public Triple(T first,U secont, V third){
        this.First=first;
        this.Secont=secont;
        this.Third=third;
    }
}
