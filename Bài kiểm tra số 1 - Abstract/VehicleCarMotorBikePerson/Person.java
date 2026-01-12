// package target.test_classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person {
    private String name;
    private String address;
    List<Vehicle> vehicleList = new ArrayList<>();


    /**
     * Function.
     */
    public Person() {}

    /**
     * Function.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Function.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * Function.
     */
    public void removeVehicle(String registrationNumber) {
        Iterator<Vehicle> it = vehicleList.iterator();
        while (it.hasNext()) {
            Vehicle v = it.next();
            if (v.registrationNumber.equals(registrationNumber)) {
                it.remove();
                return;
            }
        }
    }

    /**
     * Function.
     */
    public String getVehiclesInfo() {
        String result = name + " has";
        if (vehicleList.isEmpty()) {
            return result + " no vehicle!";
        } else {
            result += ":\n\n";
            for (Vehicle v : vehicleList) {
                result += v.getInfo();
                result += "\n";
            }
            return result;
        }
    }

    /**
     * Function.
     */
    public String getName() {
        return name;
    }

    /**
     * Function.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Function.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Function.
     */
    public void setAddress(String address) {
        this.address = address;
    }

}

