public class Item {

    private String itemName;
    private String itemType;
    private int value;

    // Constructor
    public Item(String itemName, String itemType, int value) {

        this.itemName = itemName;
        this.itemType = itemType;
        this.value = value;

    }

    // Getters
    public String getItemName() {

        return itemName;

    }

    public String getItemType() {

        return itemType;

    }

    public int getValue() {

        return value;

    }

    // Setters
    public void setItemName(String itemName) {

        this.itemName = itemName;

    }

    public void setItemType(String itemType) {

        this.itemType = itemType;

    }

    public void setValue(int value) {

        this.value = value;

    }

    // Display item information
    public void displayItem() {

        System.out.println("Item: " + itemName);
        System.out.println("Type: " + itemType);
        System.out.println("Value: " + value + " Galleons");

    }

    @Override
    public String toString() {

        return itemName + " (" + itemType + ") - Value: " + value + " Galleons";

    }

}