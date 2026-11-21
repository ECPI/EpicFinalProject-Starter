/**
 * Represents an item the player can collect (weapon, tool, artifact, etc.).
 *
 * Week 2: New class beyond the starter files.
 * - Private fields with getters and setters
 * - Created through a constructor
 * - Stored in an ArrayList inside Game
 */
public class Item {

    private String name;
    private String type;
    private int value;

    /**
     * Creates an item.
     *
     * @param name  the item's name
     * @param type  the kind of item (e.g., Weapon, Tool, Artifact)
     * @param value the item's value in gold/credits
     */
    public Item(String name, String type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSummary() {
        return "Item: " + name + " | Type: " + type + " | Value: " + value;
    }
}