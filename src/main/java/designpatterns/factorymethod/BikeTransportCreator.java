package designpatterns.factorymethod;

public class BikeTransportCreator extends TransportCreator {
    @Override
    protected Transport createTransport() {
        return new Bike();
    }
}