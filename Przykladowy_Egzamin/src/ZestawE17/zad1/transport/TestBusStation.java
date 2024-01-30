package ZestawE17.zad1.transport;

public class TestBusStation {
    public static void main(String[] args) {
        BusStation stacja1 = new BusStation("Dworzec Główny", "OLsztyn");
        stacja1.addBus("Bus A");
        stacja1.addBus("Bus B");
        IntercityBusStation m_stacja1= new IntercityBusStation("Dworzec Zachodni","Poznań",12);
        m_stacja1.addBus("Bus X");
        m_stacja1.addBus("Bus Y");

        System.out.println(stacja1.toString());
        System.out.println();
        System.out.println(m_stacja1.toString());
    }
}
