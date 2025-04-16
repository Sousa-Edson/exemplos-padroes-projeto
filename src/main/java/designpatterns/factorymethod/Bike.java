package designpatterns.factorymethod;

public class Bike implements Transport {
    @Override
    public void deliver() {
        System.out.println("Entrega feita de bicicleta.");
    }
}