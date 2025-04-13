package problems.solutions;

public class Dog extends Animals {
    String breed;
    String name;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void bark() {
        System.out.println(this.name + " barked!");
    }

    public void breed() {
        System.out.println("She is a " + this.breed +".");
    }
    }
