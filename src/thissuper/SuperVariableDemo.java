class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void printColors() {
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color);
    }
}

public class SuperVariableDemo {
    public static void main(String[] args) {
        new Dog().printColors();
    }
}
