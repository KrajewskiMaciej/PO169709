package ZestawE11.zad1.healthcare;
import java.util.Objects;
public class Clinic extends Hospital{
    public double rating;

    public Clinic(String name, double capacity, double rating){
        super(name, capacity);
        this.rating=rating;
        if(rating<0.0 || rating>5.0){
            this.rating=3.0;
        }
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }

    @Override
    public String toString(){
        if(getName() =="") {
            return getClass().getName() + ": Capacity: " + getCapacity() + "."+"\nRating: "+rating+".";
        } else {
            return getClass().getName()+": Name: "+getName()+". Capacity: "+getCapacity()+"."+"\nRating: "+rating+".";
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clinic)) return false;
        if (!super.equals(o)) return false;
        Clinic clinic = (Clinic) o;
        return Double.compare(clinic.rating, rating) == 0;
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), rating);
    }
}
