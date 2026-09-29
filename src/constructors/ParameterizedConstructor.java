class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void show() {
        System.out.println(brand + " " + year);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Car c = new Car("Honda", 2023);
        c.show();
    }
}
