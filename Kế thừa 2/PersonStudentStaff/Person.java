// package target.test_classes;

public class Person {
    private String name;
    private String address;

    /**
     * bla.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * bla.
     */
    public String getName() {
        return name;
    }

    /**
     * bla.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * bla.
     */
    public String getAddress() {
        return address;
    }

    /**
     * bla.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * bla.
     */
    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}

