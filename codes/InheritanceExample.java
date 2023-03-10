// Parent class
class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// Child class
class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public void honk() {
        System.out.println("The car is honking.");
    }

    public int getNumDoors() {
        return numDoors;
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        // Create a new Car object
        Car myCar = new Car("Toyota", "Camry", 2021, 4);

        // Call methods from the Vehicle class
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        myCar.start();
        myCar.stop();

        // Call methods from the Car class
        System.out.println("Number of doors: " + myCar.getNumDoors());
        myCar.honk();
    }
}
