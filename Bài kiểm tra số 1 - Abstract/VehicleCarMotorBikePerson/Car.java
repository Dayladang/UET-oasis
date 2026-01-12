public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Function.
     */
    public Car(String brand, String model, 
               String registrationNumber, Person owner, 
               int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Function.
     */
    public String getInfo() {
        return "Car:\n"
            + "\tBrand: " + brand
            + "\n\tModel: " + model
            + "\n\tRegistration Number: " + registrationNumber
            + "\n\tNumber of Doors: " + numberOfDoors
            + "\n\tBelongs to " + owner.getName() + " - " + owner.getAddress();
        
    }

    /**
     * Function.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Function.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
