public class LuxuryTransportFactory implements AbstractTransportFactory {
    public CargoTransport createCargo() {
        return new LuxuryCargo();
    }
    public PassengerTransport createPassenger() {
        return new LuxuryPassenger();
    }
}