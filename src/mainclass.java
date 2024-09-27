public class mainclass {
    
     public static void main(String[] args) {
           itemmanager manager = new itemmanager();

        // Adding items
        manager.addItem(new item("Apple", 10));
        manager.addItem(new item("Grapes", 30));
        manager.addItem(new item("Banana", 5));
        manager.addItem(new item("Mango", 15));
        manager.addItem(new item("Watermelon", 7));

        // Listing items
        System.out.println("Items in inventory:");
        manager.listItems();

        // Removing an item
        manager.removeItem("Apple");

        // Listing items again
        System.out.println("Items after removal:");
        manager.listItems();
    }
}
    

