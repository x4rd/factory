public class TruckFactory extends TransportFactory {
    Transport createTransport() {
        return new Truck();
    }
}