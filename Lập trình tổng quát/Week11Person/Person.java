// package target.test_classes;

public class Person implements Comparable<Person> {
    protected String name;
    protected int age;
    protected String address;

    /**
     * Function.
     */
    public Person() {}

    /**
     * Function.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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
    public int getAge() {
        return age;
    }

    /**
     * Function.
     */
    public void setAge(int age) {
        this.age = age;
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

    /**
     * Function.
     */
    public int compareTo(Person p) {
        if (!this.name.equals(p.name)) {
            return this.name.compareTo(p.name);
        } else {
            if (this.age > p.age) {
                return 1;
            } else if (this.age == p.age) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}

