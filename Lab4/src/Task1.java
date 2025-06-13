package Lab4.src;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args){

        // 1. Create an ArrayList of String Objects named names.
        List<String> names = new ArrayList<>();

        // 2. Add the names: "Alice","Bob","Charlie","David","Eve".
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // 3. Print the entire list
        System.out.println("Original list: " + names);

        // 4. Retrieve and print the element at index 2.
        String elementatindex2 = names.get(2);
        System.out.println("Element at index 2: " + elementatindex2);

        // 5. Change the element at index 1 to "Boby". Print the updated list.
        names.set(1, "Boby");
        System.out.println("Updated list after changing index 1: " + names);

        // 6. Remove the element "Charlie" from the list. Print the updated list.
        names.remove("Charlie");
        System.out.println("Updated list after removing 'Charlie': " + names);

        // 7. Check if the list contains "Alice" and print the booelean result.
        boolean containsAlice = names.contains("Alice");
        System.out.println("Does the list contain 'Alice'?: " + containsAlice);

        // 8. Print the currrent size of the list.
        int size = names.size();
        System.out.println("Current size of the list: " + size);

        // 9. Clear all elements from the list and print its size again.
        names.clear();
        size = names.size();
        System.out.println("List after clearing: " + size) ;
    }
}
