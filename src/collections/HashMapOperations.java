import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Ravi");
        students.put(102, "Priya");
        students.put(103, "Amit");
        students.put(104, "Sneha");
        students.put(105, "Vikram");
        students.put(106, "Neha");
        students.put(107, "Arjun");
        students.put(108, "Kavya");
        students.put(109, "Rahul");
        students.put(110, "Divya");

        students.put(111, "Farhan");

        System.out.println("Name of 103: " + students.get(103));

        HashMap<Integer, String> copy = new HashMap<>(students);

        System.out.println("Has key 105: " + students.containsKey(105));
        System.out.println("Has value Neha: " + students.containsValue("Neha"));
        System.out.println("Is empty: " + students.isEmpty());
        System.out.println("Size: " + students.size());

        for (Integer key : students.keySet()) {
            System.out.println("Key: " + key);
        }
        for (String value : students.values()) {
            System.out.println("Value: " + value);
        }

        students.remove(109);

        HashMap<Integer, String> another = new HashMap<>();
        another.putAll(students);
        System.out.println("Copied map size: " + another.size());
        System.out.println("Clone size: " + copy.size());
    }
}
