public class item {
     private String name;
     private int quantity;

    public item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public int getquantity() {
        return quantity;
    }
            
    public String toString() {
        return "item{" + "name='" + name + '\'' + ",quantity" + quantity + '{';
    }
}
    

