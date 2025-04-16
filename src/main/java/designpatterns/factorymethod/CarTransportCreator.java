package designpatterns.factorymethod;

public class CarTransportCreator extends TransportCreator {
    @Override
    protected Transport createTransport() {
        return new Car();
    }
}