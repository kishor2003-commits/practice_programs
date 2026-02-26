import java.util.*;
import java.util.ArrayList;
public class Array {
    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("kiwi");
        fruit.add("grapes");
        fruit.add("butterfruit");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("bangalore");
        cities.add("chennai");
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("cricket");
        hobbies.add("singing");

        System.out.println("Fruit: " + fruit);
        System.out.println("Cities: " + cities);
        System.out.println("Hobbies: " + hobbies);

        hobbies.remove("cricket");
        System.out.println("After removing hobby: " + hobbies);
        if(hobbies.contains("cricket"))
            System.out.println("Cricket found");
        else
            System.out.println("Cricket not found");
        cities.remove("chennai");
        fruit.remove("orange");
        System.out.println("After removing city: " + cities);
        System.out.println("After removing fruit: " + fruit);

        // Print 4th & 6th element of fruit
        System.out.println("4th element: " + fruit.get(3));
        System.out.println("6th element: " + fruit.get(5));

        // Replace singing with dancing
        int index = hobbies.indexOf("singing");
        if(index != -1) {
            hobbies.set(index, "dancing");
        }
        System.out.println("After replacing: " + hobbies);

        // Reverse
        Collections.reverse(fruit);
        System.out.println("After reverse: " + fruit);

        // Add Kerala at 4th position (index 3)
        cities.add(3, "Kerala");

        // Add Mango at 2nd position (index 1)
        fruit.add(1, "Mango");

        System.out.println("Final Fruit: " + fruit);
        System.out.println("Final Cities: " + cities);
        System.out.println("Final Hobbies: " + hobbies);
    }
}