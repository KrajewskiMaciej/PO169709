package ZestawE11.zad2;

public class Dog2 implements Cloneable{
    String breed;
    double age;

    public Dog2(String breed, double age){
        this.breed=breed;
        this.age=age;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public String getBreed() {
        return breed;
    }
    public double getAge() {
        return age;
    }
    public String toString(){
        return "Rasa: "+breed+". Wiek: "+age+".\n";
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


class TestDog{
    public static void main(String[] args) {
        Dog2 pies1 = new Dog2("Owczarek Niemiecki", 5);
        try {
            Dog2 pies2 = (Dog2) pies1.clone();
            pies1.setAge(7);
            System.out.println(pies1);
            System.out.println(pies2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}

