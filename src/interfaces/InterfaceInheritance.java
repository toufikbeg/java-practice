interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class Implementer implements ChildInterface {
    public void parentMethod() {
        System.out.println("Parent interface method");
    }

    public void childMethod() {
        System.out.println("Child interface method");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Implementer obj = new Implementer();
        obj.parentMethod();
        obj.childMethod();
    }
}
