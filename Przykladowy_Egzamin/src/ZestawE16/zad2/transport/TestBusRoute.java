package ZestawE16.zad2.transport;

public class TestBusRoute {
    public static void main(String[] args) {
        BusRoute trasa1 = new BusRoute("51284","Start A", "End A");
        BusRoute trasa2 = new BusRoute("112","Start B", "End B");

        System.out.println(trasa1.printDetails());
        System.out.println("Czy trasa jest długa: "+trasa1.isLongRoute());
        System.out.println(trasa2.printDetails());
        System.out.println("Czy trasa jest długa: "+trasa2.isLongRoute());
    }
}
