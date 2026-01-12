public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Function.
     */
    public Vehicle(String brand, String model, 
                   String registrationNumber, Person owner) {
                    this.brand = brand;
                    this.model = model;
                    this.registrationNumber = registrationNumber;
                    this.owner = owner;
    }

    /**
     * Function.
     */
    public abstract String getInfo();

    /**
     * Function.
     */
    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    /**
     * Function.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Function.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Function.
     */
    public String getModel() {
        return model;
    }

    /**
     * Function.
     */
    public void setModel(String model) {
        this.model = model;
    }
    
    /**
     * Function.
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Function.
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Function.
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Function.
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
