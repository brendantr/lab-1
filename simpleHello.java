import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

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

        // HashSet example from TA
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate entry, will be ignored
        System.out.println("Size (HashSet): " + set.size()); // Getting size
        set.remove("Banana"); // Removing an element
        System.out.println("HashSet after removal: " + set);

        // TreeMap example from TA
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 30);
        System.out.println("First Key (TreeMap): " + treeMap.firstKey()); // Accessing first key
        System.out.println("Last Key (TreeMap): " + treeMap.lastKey()); // Accessing last key
        System.out.println("Value for key 'Banana': " + treeMap.get("Banana"));
        treeMap.remove("Banana"); // Removing a key-value pair
        System.out.println("TreeMap after removal: " + treeMap);

        // TreeSet example from TA
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        System.out.println("First Element (TreeSet): " + treeSet.first());
        System.out.println("Last Element (TreeSet): " + treeSet.last());
        treeSet.remove("Banana"); // Removing an element
        System.out.println("TreeSet after removal: " + treeSet);
    }
}