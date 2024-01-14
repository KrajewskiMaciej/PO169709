package zad2;

import zad1.Person;

public class TestSilnik {
    public static void main(String[] args) {
        BenzynowySilnik s1 =new BenzynowySilnik();
        Samochód sam1 =new Samochód(s1);
        sam1.start();
        sam1.stop();
    }
}
