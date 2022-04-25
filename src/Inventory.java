import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> itemList;

    public Inventory(){
        itemList = new ArrayList<>();
    }

    public void addItem(Item item){
        System.out.println("Item added successfully!: ");
        System.out.printf("Item ID: %d\n", item.getStockNumber());
        System.out.printf("Item name: %s\n", item.getItemName());
        System.out.printf("Item quantity: %d\n\n", item.getStock());
        this.itemList.add(item);
    }

    public void discontinueItem(Item item){
        System.out.println("Item discontinued.");
        item.setItemName("Discontinued");
        item.setStock(0);
    }

    public void displayProductInfo(Item item){
        System.out.printf("Item ID: %d\n", item.getStockNumber());
        System.out.printf("Item name: %s\n", item.getItemName());
        System.out.printf("Item quantity: %d\n\n", item.getStock());
    }

    public ArrayList<Item> getItemList(){
        return this.itemList;
    }
}
