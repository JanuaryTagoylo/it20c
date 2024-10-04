package linkedlist;

import java.util.LinkedList;

public class Linkedlist {


    public static void main(String[] args) {
        
          LinkedList<String> stringList = new LinkedList<>();

        // Add elements to the LinkedList
        stringList.add("Enchanted Book");
        stringList.add("Talisman");
        stringList.add("Imp");
        stringList.add("Ale");

        // Display the LinkedList
        System.out.println("Original LinkedList: " + stringList);

        // Add an element at a specific position
        stringList.add(2, "");
        System.out.println("After adding Talisman at index 2: " + stringList);

        // Remove an element
        stringList.remove("Banana");
        System.out.println("After removing Imp: " + stringList);

        // Get an element from the LinkedList
        String fruit = stringList.get(1);
        System.out.println("Element at index 1: " + fruit);
        System.out.println("------------------------------");
          

        // Iterate through the LinkedList
        System.out.println("Iterating through the LinkedList:");
        for (String str : stringList) {
            System.out.println(str);
            System.out.println("------------------------------");
        }

        // Check if the LinkedList contains an element
        boolean hasCherry = stringList.contains("Enchanted Book");
        System.out.println("Does the list contain Enchanted Book? " + hasCherry);
         System.out.println("------------------------------");

        // Clear the LinkedList
        stringList.clear();
        System.out.println("After clearing the LinkedList: " + stringList);
    }
}
    
	


        
        
        
        

    
    

