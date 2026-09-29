import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Papaya");
        fruits.add("Guava");
        fruits.add("Lychee");
        fruits.add("Peach");
        fruits.add("Plum");

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        fruits.add(2, "Kiwi");
        fruits.remove("Plum");
        fruits.remove(0);
        fruits.set(1, "Berry");

        System.out.println("Element at index 2: " + fruits.get(2));
        System.out.println("Index of Mango: " + fruits.indexOf("Mango"));
        System.out.println("Size: " + fruits.size());
        System.out.println("Contains Grapes: " + fruits.contains("Grapes"));

        fruits.clear();
        System.out.println("Size after clear: " + fruits.size());
    }
}
