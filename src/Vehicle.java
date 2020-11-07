public class Vehicle {
    private int doors;
    private int wheels;
    private String make;
    private String model;

    public Vehicle() {

    }

    // Constructor
    public Vehicle(int theDoors, int theWheels, String theMake, String theModel) {
        this.doors = theDoors;
        this.wheels = theWheels;
        this.make = theMake;
        this.model = theModel;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
