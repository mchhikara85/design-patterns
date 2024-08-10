package main.java.creational.abstractfactory;

public class FactoryProducer {
    public static VehicleFactory getVehicleFactory(boolean luxury) {
        if (luxury) {
            return new LuxuryVehicleFactory();
        } else {
            return new OrdinaryVehicleFactory();
        }
    }
}
