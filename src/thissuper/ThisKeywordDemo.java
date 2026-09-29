class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Employee e = new Employee("Toufik", 22);
        e.show();
    }
}
