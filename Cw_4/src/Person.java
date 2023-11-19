
public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName,String lastName,int age){
        if(this.firstName=="" || this.firstName==null){
            firstName="Nie podano";
        }
        if(this.lastName=="" || this.lastName==null){
            lastName="Nie podano";
        }
        if(this.age<0){
            this.age=0;
        }

    }
    public String toString(){
        return "Person: "+firstName+" "+lastName+"\nAge:"+" "+age;
    }
}
