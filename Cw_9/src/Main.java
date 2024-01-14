// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dog pies=new Dog();
        Cat kot=new Cat();

        pies.makeNoise();
        kot.makeNoise();

        TestMyComparator porownaj = new TestMyComparator();

        System.out.println(porownaj.compare(3,5));


    }
}