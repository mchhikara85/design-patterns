package main.java.creational.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        VehicleFactory luxuryVehicleFactory = FactoryProducer.getVehicleFactory(true);
        VehicleFactory ordinaryVehicleFactory = FactoryProducer.getVehicleFactory(false);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(ordinaryVehicleFactory.createVehicle("Maruti"));
        vehicles.add(luxuryVehicleFactory.createVehicle("Mercedes"));
        vehicles.add(luxuryVehicleFactory.createVehicle("BMW"));

        for (Vehicle vehicle : vehicles) {
            vehicle.details();
        }
    }
}
