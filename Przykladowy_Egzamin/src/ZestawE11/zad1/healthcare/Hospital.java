package ZestawE11.zad1.healthcare;
import java.util.Objects;
import javax.management.StringValueExp;

public class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name,double capacity){
        this.name=name;
        this.capacity=capacity;
        if(name==null){
            this.name="";
        }
        if(capacity<0){
            this.capacity=50.0;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public String toString(){
        if(name=="") {
            return getClass().getName() + ": Capacity: " + getCapacity() + ".";
        } else {
            return getClass().getName()+": Name: "+getName()+". Capacity: "+getCapacity()+".";
        }
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Double.compare(hospital.capacity, capacity) == 0 &&
                Objects.equals(name, hospital.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, capacity);
    }
}
