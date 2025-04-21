package problems.solutions.transportNetwork;

public abstract class TransportVehicle {
        int speed;
        String name;

    // Constructor to initialize the fields
    public TransportVehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // Concrete method to start the vehicle
    public void start() {
        System.out.println(name + " has started.");
    }

    // Abstract method for movement
    public abstract void move();
}

