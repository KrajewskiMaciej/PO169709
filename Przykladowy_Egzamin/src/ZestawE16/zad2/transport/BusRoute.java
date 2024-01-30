package ZestawE16.zad2.transport;

public record BusRoute(String routeNumber, String startLocation, String endLocation) {
    public BusRoute{

        if(routeNumber==null || routeNumber==""){
            throw new IllegalArgumentException();
        }
    }

    public boolean isLongRoute(){
        if(routeNumber.length()>4){
            return true;
        }else {
            return false;
        }
    }

    public String printDetails(){
        return "Trasa:\n Z: "+startLocation+"\n Do: "+endLocation+"\n Długość trasy: "+routeNumber;
    }
}
