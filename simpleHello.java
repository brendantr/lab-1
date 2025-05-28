import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class simpleHello {
    public static void main(String[] args) {
        // ArrayList example from TA
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Orange");
        System.out.println("First Element (ArrayList): " + myArrayList.get(0)); // Accessing elements
        System.out.println("Size (ArrayList): " + myArrayList.size()); // Getting size
        myArrayList.remove("Banana"); // Removing element
        System.out.println("ArrayList after removal: " + myArrayList);

        // LinkedList example from TA
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Apple");
        myLinkedList.addFirst("Banana"); // Adds at the start
        myLinkedList.addLast("Orange"); // Adds at the end
        System.out.println("First Element (LinkedList): " + myLinkedList.getFirst());
        System.out.println("Last Element (LinkedList): " + myLinkedList.getLast());
        myLinkedList.removeFirst(); // Removing the first element
        System.out.println("LinkedList after removing first: " + myLinkedList);

        // HashMap example from TA
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        System.out.println("Apple Quantity: " + map.get("Apple")); // Accessing values
        System.out.println("Size (HashMap): " + map.size()); // Getting size
        map.remove("Banana"); // Removing a key-value pair
        System.out.println("HashMap after removal: " + map);
    }
}