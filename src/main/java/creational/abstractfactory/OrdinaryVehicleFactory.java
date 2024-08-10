package main.java.creational.abstractfactory;

public class OrdinaryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String model) {
        if (model.equalsIgnoreCase("Maruti")) {
            return new Maruti();
        }
        return null;
    }
}
