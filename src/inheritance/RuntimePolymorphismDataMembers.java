class Parent {
    int balance = 1000;
}

class Child extends Parent {
    int balance = 5000;
}

public class RuntimePolymorphismDataMembers {
    public static void main(String[] args) {
        Parent ref = new Child();
        System.out.println("Accessed with parent reference: " + ref.balance);
        System.out.println("Data members do not get overridden, they are resolved by reference type");
    }
}
