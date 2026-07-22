import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    // Constructor
    public Inventory() {

        items = new ArrayList<>();

    }

    // Add an item
    public void addItem(Item item) {

        items.add(item);

        System.out.println();
        System.out.println(item.getItemName() + " has been added to your inventory!");

    }

    // Check if an item exists
    public boolean hasItem(String itemName) {

        for (Item item : items) {

            if (item.getItemName().equalsIgnoreCase(itemName)) {

                return true;

            }

        }

        return false;

    }

    // Remove an item
    public void removeItem(String itemName) {

        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).getItemName().equalsIgnoreCase(itemName)) {

                items.remove(i);

                System.out.println(itemName + " was removed from your inventory.");

                return;

            }

        }

    }

    // Returns an Item object
    public Item getItem(String itemName) {

        for (Item item : items) {

            if (item.getItemName().equalsIgnoreCase(itemName)) {

                return item;

            }

        }

        return null;

    }

    // Number of items
    public int getItemCount() {

        return items.size();

    }

    // Display inventory
    public void displayItems() {

        System.out.println();
        System.out.println("=================================");
        System.out.println("          INVENTORY");
        System.out.println("=================================");

        if (items.isEmpty()) {

            System.out.println("Your inventory is empty.");

        }

        else {

            int counter = 1;

            for (Item item : items) {

                System.out.println(counter + ". " + item);

                counter++;

            }

        }

        System.out.println("=================================");

    }

    // Use a Healing Potion
    public boolean useHealingPotion(GameCharacter player) {

        for (int i = 0; i < items.size(); i++) {

            Item item = items.get(i);

            if (item.getItemName().equalsIgnoreCase("Healing Potion")) {

                player.heal(30);

                items.remove(i);

                System.out.println();
                System.out.println("You used a Healing Potion!");
                System.out.println("30 Health Restored!");

                return true;

            }

        }

        System.out.println();
        System.out.println("You do not have a Healing Potion.");

        return false;

    }

}