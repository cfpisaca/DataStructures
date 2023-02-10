package lab4;

public class CarTester {
    public static void main(String[] args) {
        Car car1;
        Car car2;

        car1 = new Car("Audi", 2022);
        car2 = new Car("Ferrari", 2025);

        for (int i = 0; i < 5; i++) {
            car1.accelerate();
            car1.getSpeed();
            System.out.println(car1.toString());
        }

        for (int i = 0; i < 3; i++) {
            car2.accelerate();
            car2.getSpeed();
            System.out.println(car2.toString());
        }


        for (int i = 0; i < 5; i++) {
            car1.brake();
            car1.getSpeed();
            System.out.println(car1.toString());
        }

        System.out.println();
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}




