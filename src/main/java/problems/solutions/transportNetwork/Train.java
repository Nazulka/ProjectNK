package problems.solutions.transportNetwork;

public class Train extends TransportVehicle {
    public Train(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println("Train is accelerating on tracks.");
    }
}