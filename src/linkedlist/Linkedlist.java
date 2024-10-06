package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {


    public static void main(String[] args) {
        
          LinkedList<String> stringList = new LinkedList<>();
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter strings to add to the LinkedList (type 'exit' to finish):");
        
        while (true) {
            // Read user input
            String input = scanner.nextLine();
            
            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            // Add the input string to the LinkedList
            stringList.add(input);
        }
        
        // Display the strings stored in the LinkedList
        System.out.println("Strings in the LinkedList:");
        for (String str : stringList) {
            System.out.println(str);
        }
        
        // Close the scanner
        scanner.close();
    }
}
         
    


   
    
	


        
        
        
        

    
    

