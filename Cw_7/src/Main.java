// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("Władca Pierścienia", "J.R.R. Tolkien", 54, 1940);

        System.out.println(book1);

        Address ad1 = new Address("Dworcowa", 12, "12-732", "Wejherowo");
        Person p1 = new Person("Adam", "Bachleda", ad1 );

        System.out.println(p1);
        System.out.println(ad1);
        System.out.println(p1.address());

        Point2D pt1 = new Point2D(2.12,23.31);
        Point2D p2 = new Point2D(1,7);

        System.out.println(pt1.distanceTo(p2));
    }
}