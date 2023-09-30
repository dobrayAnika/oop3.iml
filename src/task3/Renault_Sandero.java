package task3;

public class Renault_Sandero extends CarAbstract {
    private final String number;

    public Renault_Sandero(String number) {
        this.number = number;
    }

    @Override
    public void getAutomaker() {
        System.out.println("Мои родители-производители - Renault");
    }

    @Override
    public void getNumber() {
        System.out.printf("Мой номер: %s\n", number);
    }


    public void love() {
        System.out.println("Я люблю наших японских братьев - Nissan");
    }
}
