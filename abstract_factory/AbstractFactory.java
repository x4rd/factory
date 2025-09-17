public class AbstractFactory {
    public static void main(String[] args) {

        // Economy factory

        AbstractTransportFactory economy_factory = new EconomyTransportFactory();

        CargoTransport economy_cargo_transport = economy_factory.createCargo();
        PassengerTransport economy_passender_transport = economy_factory.createPassenger();

        economy_cargo_transport.deliverCargo();
        economy_passender_transport.transportPassengers();

        // Luxury factory

        AbstractTransportFactory luxury_factory = new LuxuryTransportFactory();

        CargoTransport luxury_cargo_transport = luxury_factory.createCargo();
        PassengerTransport luxury_passenger_transport = luxury_factory.createPassenger();

        luxury_cargo_transport.deliverCargo();
        luxury_passenger_transport.transportPassengers();
    }
}