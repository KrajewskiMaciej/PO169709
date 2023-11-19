public class Vehicle {
    private String brand;
    private String model;
    public Vehicle(){

    }

    public Vehicle(String brand, String model){
        this.brand=brand;
        this.model=model;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String model){
        this.brand=brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }


}
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors){
        super(brand, model);
        this.numberOfDoors=numberOfDoors;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors=numberOfDoors;
    }
}
