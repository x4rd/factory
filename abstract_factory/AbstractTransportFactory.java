public interface AbstractTransportFactory {
    CargoTransport createCargo();
    PassengerTransport createPassenger();
}