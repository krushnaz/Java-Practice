import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // Creating an ArrayList to store strings
        List<String> myList = new ArrayList<>();

        // Adding elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Accessing elements using index
        System.out.println("Elements in the list:");
        for (String fruit : myList) {
            System.out.println(fruit);
        }

        // Adding an element at a specific index
        myList.add(1, "Mango");

        // Removing an element by value
        myList.remove("Orange");

        // Checking if an element exists in the list
        boolean containsBanana = myList.contains("Banana");
        System.out.println("Does list contain Banana? " + containsBanana);

        // Getting the size of the list
        int size = myList.size();
        System.out.println("Size of the list: " + size);

        // Clearing the list
        myList.clear();

        // Checking if the list is empty after clearing
        boolean isEmpty = myList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
    }
}
