import task3.BMW_X3;
import task3.Car;
import task3.Renault_Sandero;


public class Main {
    public static void main(String[] args) {
        BMW_X3 car1 = new BMW_X3(180, "X3 M40d", "white");
        Car car2 = new Car(80, "2100", "gray");
        Renault_Sandero car3 = new Renault_Sandero("Х010АМ136");

        car1.color();
        car1.maxSpeed();
        car1.model();

        System.out.println();

        car2.color();
        car2.maxSpeed();
        car2.model();

        System.out.println();

        car3.love();
        car3.getAutomaker();
        car3.getNumber();

    }
}
