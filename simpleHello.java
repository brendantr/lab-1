import java.util.ArrayList;
import java.util.LinkedList;

public class simpleHello {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Create a LinkedList of Integers
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Print ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Print LinkedList
        System.out.println("LinkedList: " + linkedList);
    }
}