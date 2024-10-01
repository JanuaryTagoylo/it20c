package main;


public class Main {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        // Adding elements to the list
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(120);
        System.out.println("Current Linked List: MuseDssh");
        list.printList();
        
        //Delete
        System.out.println();
        System.out.println("Deleting 2 from the list...");
        System.out.println("Current Linked List: MDMC DLC Muse Dash Pack");
        list.deleteByValue(50);
        list.printList();
        
        //Move/Swap Pointer
        System.out.println();
        System.out.println("Movingn/Swapping node from index 1 to index 0");
        list.moveNodePointer(0, 1);
        list.printList();
	}
}

    
    

