public class Wiek {
    public int age;

    public Wiek(int age){
        this.age=age;
    }

    public void checkAge(){
        if (age < 18) {
            throw new IllegalArgumentException("Wiek nie może być mniejszy niż 18.");
        } else {
            System.out.println("Wiek zaakceptowany: " + age);
        }
    }
}
