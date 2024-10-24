import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class topic4queue {

    // Customer class to represent a customer
    static class customer {
        private String name;

        public customer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Customer> customerQueue = new LinkedList<>(); // Use LinkedList as a Queue

        System.out.println("Welcome to the Customer Queue System!");

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter customer name: ");
                    String customerName = sc.nextLine();
                    customerQueue.add(new Customer(customerName)); // Add customer to queue
                    System.out.println("Customer added: " + customerName);
                    break;

                case "2":
                    if (!customerQueue.isEmpty()) {
                        Customer servedCustomer = customerQueue.poll(); // Serve customer
                        System.out.println("Served Customer: " + servedCustomer.getName());
                    } else {
                        System.out.println("No customers in queue.");
                    }
                    break;

                case "3":
                    if (customerQueue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        System.out.println("Current Queue:");
                        for (Customer customer : customerQueue) {
                            System.out.println(customer.getName());
                        }
                    }
                    break;

                case "4":
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close(); // Close the scanner
                    return; // Exit the program

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}


    
    

