public class FactoryMethod {
    public static void main(String[] args) {
        // Truck
        TransportFactory truck_factory = new TruckFactory();
        Transport truck_transport1 = truck_factory.createTransport();
        truck_transport1.deliver();

        // Ship
        TransportFactory ship_factory = new ShipFactory();
        Transport ship_transport2 = ship_factory.createTransport();
        ship_transport2.deliver();
    }
}