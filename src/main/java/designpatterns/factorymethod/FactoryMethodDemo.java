package designpatterns.factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        TransportCreator creator1 = new CarTransportCreator();
        creator1.planDelivery();  // Entrega feita de carro.

        TransportCreator creator2 = new BikeTransportCreator();
        creator2.planDelivery();  // Entrega feita de bicicleta.
    }
}
