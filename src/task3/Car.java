package task3;

public class Car {
    protected final int maxSpeed;
    protected final String model;
    protected final String color;

    public Car(int maxSpeed, String model, String color) {
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.color = color;
    }

    public void color() {
        System.out.printf("My color is %s\n", color);
    }

    public void maxSpeed() {
        System.out.printf("My max speed = %s kph\n", maxSpeed);
    }

    public void model() {
        System.out.printf("I'm %s\n", model);
    }
}
