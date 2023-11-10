package Garage;

public class Bus extends Car{
    public Bus(String type, String marka, String model, int age, String color) {
        super(type, marka, model, age, color);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
