public class ShipFactory extends TransportFactory {
    Transport createTransport() {
        return new Ship();
    }
}
