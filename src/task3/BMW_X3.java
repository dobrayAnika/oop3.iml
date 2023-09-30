package task3;

public class BMW_X3 extends Car {
    public BMW_X3(int maxSpeed, String model, String color) {
        super(maxSpeed, model, color);
    }

    @Override
    public void color() {
        System.out.printf("Мой цвет - %s\n", color);
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Моя максильманая скорость вот такая %s (км/ч), но до первого чека\n", maxSpeed);
    }

    @Override
    public void model() {
        System.out.printf("Я %s\n", model);
    }
}
