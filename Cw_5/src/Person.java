public class Person {
    private String firstName;
    protected String lastName;

    public Person(){
        this.firstName="imie";
        this.lastName="nazwisko";
    }
    public String getPrivate(){
        return firstName;
    }

}

class Employee extends Person{
    public void displayData(){
        System.out.println(lastName);
        System.out.println(getPrivate());

    }
}
