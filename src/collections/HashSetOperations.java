import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Kolkata");
        cities.add("Jaipur");
        cities.add("Indore");
        cities.add("Surat");

        cities.add("Hyderabad");

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Size: " + cities.size());
        System.out.println("Contains Pune: " + cities.contains("Pune"));
        cities.remove("Surat");
        System.out.println("Size after remove: " + cities.size());

        HashSet<String> copy = new HashSet<>(cities);
        System.out.println("Copy size: " + copy.size());

        cities.clear();
        System.out.println("Is empty: " + cities.isEmpty());
    }
}
