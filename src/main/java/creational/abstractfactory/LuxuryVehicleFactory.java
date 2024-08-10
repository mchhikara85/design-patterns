package main.java.creational.abstractfactory;

public class LuxuryVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle(String model) {
        if (model.equalsIgnoreCase("Mercedes")) {
            return new Mercedes();
        } else if (model.equalsIgnoreCase("BMW")) {
            return new Bmw();
        }
        return null;
    }
}
