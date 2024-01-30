package ZestawE11.zad2;

public class Triple <T>{
    T first;
    T second;
    T third;

    public Triple(T first, T second, T third){
        this.first=first;
        this.second=second;
        this.third=third;
    }

}
class Canine{

}
class Dog extends Canine{

}

class TestTriple {
    public static void main(String[] args) {
        Triple t1 = new Triple<>(21,"WSAD",-23.31);
        Triple t2 = new Triple<>(1,421,"SSAAS");
        System.out.println(findMin(t1,t2));
    }

    static <T> boolean findMin(Triple<T> ob1, Triple<T> ob2){
        return ob1.first.getClass() == ob2.first.getClass() &&
                ob1.second.getClass() == ob2.second.getClass() &&
                ob1.third.getClass() == ob2.third.getClass();
    }
}
