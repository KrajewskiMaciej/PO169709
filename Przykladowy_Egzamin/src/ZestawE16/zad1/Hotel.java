package ZestawE16.zad1;

public class Hotel implements Cloneable{
    private String name;
    private double capacity;

    public Hotel(String name, double capacity){
        if(name==null){
            name="";
        }
        this.name=name;
        if(capacity<0) {
            capacity = 50.0;
        }
        this.capacity=capacity;


    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Nazwa Hotelu: "+name+" Liczba pokoi: "+capacity;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
