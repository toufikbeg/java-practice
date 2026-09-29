import java.lang.reflect.Field;

public class GenerateNoSuchField {
    public static void main(String[] args) {
        try {
            Field field = String.class.getField("noSuchField");
            System.out.println(field);
        } catch (NoSuchFieldException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
