public class StaticDemo {
    static String college = "JNTU";
    static int totalStudents = 500;
    String studentName;
    int rollNumber;

    static void collegeInfo() {
        System.out.println("College: " + college);
    }

    static void totalInfo() {
        System.out.println("Total students: " + totalStudents);
    }

    void setDetails(String name, int roll) {
        studentName = name;
        rollNumber = roll;
    }

    void showDetails() {
        System.out.println(studentName + " - " + rollNumber);
    }

    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo();
        s1.setDetails("Toufik", 21);
        s1.showDetails();
        collegeInfo();
        totalInfo();
        System.out.println("College from main: " + college);
        System.out.println("Student from main: " + s1.studentName);
    }
}
