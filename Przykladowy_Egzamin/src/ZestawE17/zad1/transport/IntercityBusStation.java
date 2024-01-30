package ZestawE17.zad1.transport;

public class IntercityBusStation extends BusStation{
    private int numberOfPlatforms;

    public IntercityBusStation(String name,String city, int numberOfPlatforms){
        super(name, city);
        this.numberOfPlatforms=numberOfPlatforms;
    }

    public int getNumberOfPlatforms() {
        return numberOfPlatforms;
    }

    public void setNumberOfPlatforms(int numberOfPlatforms) {
        this.numberOfPlatforms = numberOfPlatforms;
    }

    @Override
    public String toString() {
        return getName()+": "+getCity()+": "+numberOfPlatforms+"\n"+getBuses();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
