package problems.solutions.transportNetwork;

public class Main {
    public static void main(String[] args) {
        // Create an array of TransportVehicle objects
        TransportVehicle[] vehicles = new TransportVehicle[2];

        // Instantiate specific vehicles
        vehicles[0] = new Bicycle("Mountain Bike", 15);
        vehicles[1] = new Train("Express Train", 100);

        // Loop through the array and call start() and move()
        for (TransportVehicle vehicle : vehicles) {
            vehicle.start();  // Calls the start() method from TransportVehicle class
            vehicle.move();   // Calls the overridden move() method from specific subclass
        }
    }
}