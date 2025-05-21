package Day8;

import java.util.ArrayList;
import java.util.Iterator;

public class Test26 {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(45);
        numbers.add(78);

        // Print the entire list
        System.out.println("List: " + numbers);

        // Use an Iterator to print elements one by one
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("Iterating through the list:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
