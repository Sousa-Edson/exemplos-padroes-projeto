package designpatterns.factorymethod;

public abstract class TransportCreator {
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    // Factory Method
    protected abstract Transport createTransport();
}