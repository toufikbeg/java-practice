public class InstanceInStatic {
    int instanceVar = 99;

    public static void main(String[] args) {
        InstanceInStatic obj = new InstanceInStatic();
        System.out.println("Instance variable from static method: " + obj.instanceVar);
    }
}
