package main.java.creational;

import main.java.creational.abstractfactory.FactoryProducer;
import main.java.creational.abstractfactory.Vehicle;
import main.java.creational.abstractfactory.VehicleFactory;
import main.java.creational.builder.Student;
import main.java.creational.builder.StudentBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main1(String[] args) {
        VehicleFactory luxuryVehicleFactory = FactoryProducer.getVehicleFactory(true);
        VehicleFactory ordinaryVehicleFactory = FactoryProducer.getVehicleFactory(false);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(ordinaryVehicleFactory.createVehicle("Maruti"));
        vehicles.add(luxuryVehicleFactory.createVehicle("Mercedes"));
        vehicles.add(luxuryVehicleFactory.createVehicle("BMW"));

        for (Vehicle vehicle : vehicles) {
            vehicle.details();
        }

        Student student = new StudentBuilder()
                .name("Abhimanyu")
                .age(8)
                .gender("Male")
                .college("Greensboro Academy")
                .build();

        System.out.println(student);
    }
}
