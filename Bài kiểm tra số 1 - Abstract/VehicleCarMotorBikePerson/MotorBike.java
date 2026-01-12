public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Function.
     */
    public MotorBike(String brand, String model, 
                     String registrationNumber, Person owner, 
                     boolean hasSideCar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSideCar;
    }

    /**
     * Function.
     */
    public String getInfo() {
        return "Motor Bike:\n"
            + "\tBrand: " + brand
            + "\n\tModel: " + model
            + "\n\tRegistration Number: " + registrationNumber
            + "\n\tHas Side Car: " + hasSidecar
            + "\n\tBelongs to " + owner.getName() + " - " + owner.getAddress();
    }

    /**
     * Function.
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * Function.
     */
    public void setHasSidecar(boolean hasSideCar) {
        this.hasSidecar = hasSideCar;
    }
}
