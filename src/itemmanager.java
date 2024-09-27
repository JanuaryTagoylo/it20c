import java.util.ArrayList;

public class itemmanager {
    private ArrayList<item> items;

    public itemmanager() {
        this.items = new ArrayList<>();
    }

    // Add an item
    public void addItem(item item) {
        items.add(item);
    }

    // Remove an item by name
    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equals(name));
    }

    // List all items
    public void listItems() {
        for (item item : items) {
            System.out.println(item);
        }
    }
}

    

