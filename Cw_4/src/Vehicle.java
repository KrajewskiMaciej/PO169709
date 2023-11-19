public class Vehicle {
    String brand;
    String model;
    int yearOfProduction;

    public Vehicle(String brand,String model,int yearOfProduction){
        this.yearOfProduction = this.yearOfProduction > 2023 ? this.yearOfProduction: 2023;

        this.brand=this.brand==""||this.brand==null ? this.brand:"Nie podano";

        this.model=this.model==""||this.model==null ? this.model:"Nie podano";
    }


    public String toString() {
        return String.format("Vehicle: %s %s \nYear: %d",brand,model,yearOfProduction);
    }

    public boolean equals(Vehicle other) {
        if (this.brand.equals(other.brand) && this.model.equals(other.model) && this.yearOfProduction == other.yearOfProduction) {
            return true;
        }
        return false;
    }
}
