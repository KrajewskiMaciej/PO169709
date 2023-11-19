public class Animal {
    public String imie;
    public Animal(){
        this.imie="Zwierze";
    }
    public Animal(String imie){
        this.imie=imie;
    }
    public void makeSound(){
        System.out.println("Generic animal noises");
    }
}

class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Miau miau");

    }
}
