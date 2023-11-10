package Garage;

import java.util.Objects;

abstract public class Car implements CarType {
    private String type;
    private String marka;
    private String model;
    private int age;

    private String color;

    public Car(String type, String marka, String model, int age, String color) {
        this.type = type;
        this.marka = marka;
        this.model = model;
        this.age = age;
        this.color = color;
    }

    @Override
    public String getType() {
        return type;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(getType(), car.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
