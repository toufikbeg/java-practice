public class CreateClassDemo {

    int number;

    void setNumber(int value) {
        number = value;
    }

    int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        CreateClassDemo obj = new CreateClassDemo();
        obj.setNumber(25);
        System.out.println("Object created with value: " + obj.getNumber());
    }
}
