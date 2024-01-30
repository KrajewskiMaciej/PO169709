package ZestawE11.zad2;

public interface Drinkable {
    abstract void drink();
}

class OrangeJuice implements Drinkable{
    @Override
    public void drink(){
        System.out.println("Piję sok pomarańczowy");
    }
}

class Water implements Drinkable{
    @Override
    public void drink(){
        System.out.println("Piję wodę");
    }
}

class Bottle{
    public Drinkable drinkable;
    public Bottle(Drinkable drinkable){
        this.drinkable=drinkable;
    }
    public void setDrinkable(Drinkable drinkable) {
        this.drinkable = drinkable;
    }
    public Drinkable getDrinkable() {
        return drinkable;
    }
    void drink(){
        drinkable.drink();
    }
}

class TestDrinkable{
    public static void main(String[] args) {
        Bottle butelka1 = new Bottle(new Water());
        Bottle butelka2 = new Bottle(new OrangeJuice());

        butelka1.drink();
        butelka2.drink();
    }
}

