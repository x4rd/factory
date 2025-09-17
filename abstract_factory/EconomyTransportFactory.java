public class EconomyTransportFactory implements AbstractTransportFactory {
    public CargoTransport createCargo() {
        return new EconomyCargo();
    }
    public PassengerTransport createPassenger() {
        return new EconomyPassenger();
    }
}