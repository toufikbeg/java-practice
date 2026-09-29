class Student {
    int id;
    String name;

    void show() {
        System.out.println(id + " " + name);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        System.out.println("Default values come from the compiler-inserted constructor");
    }
}
