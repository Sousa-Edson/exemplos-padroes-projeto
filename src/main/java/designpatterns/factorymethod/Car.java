package designpatterns.factorymethod;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Entrega feita de carro.");
    }
}