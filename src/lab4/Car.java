package lab4;

public class Car {
    private int year;
    private String make;
    private double speed;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
        this.speed = 0;
    }

    public String toString() {
        return String.format("A  %d %s that is going %.1f mph", year, make, speed);
    }

    public String getMake() {
        return make;
    }

    public double getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public void accelerate() {
        speed = speed + 5;
    }

    public void brake() {
        speed = speed - 5;
    }
}