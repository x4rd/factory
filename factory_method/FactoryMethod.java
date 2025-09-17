public class FactoryMethod {
    public static void main(String[] args) {
        TransportFactory truck_factory = new TruckFactory(); // choose truck
        Transport truck_transport1 = truck_factory.createTransport();
        truck_transport1.deliver();

        TransportFactory ship_factory = new ShipFactory(); // choose ship
        Transport ship_transport2 = ship_factory.createTransport();
        ship_transport2.deliver();
    }
}