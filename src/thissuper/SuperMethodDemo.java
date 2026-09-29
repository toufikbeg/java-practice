class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        super.eat();
        System.out.println("Cat drinks milk");
    }
}

public class SuperMethodDemo {
    public static void main(String[] args) {
        new Cat().eat();
    }
}
