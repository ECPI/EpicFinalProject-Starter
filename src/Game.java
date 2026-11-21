import java.util.ArrayList;
import java.util.Scanner;

/**
 * Controls the main game flow and menu system.
 *
 * Week 2 additions:
 * - ArrayList<Character> party stores characters created by the user
 * - ArrayList<Item> inventory stores items created by the user
 * - Menu options to add and view both collections
 */
public class Game {

    private Scanner input;
    private Player player;
    private boolean running;

    // Week 2 collections
    private ArrayList<Character> party;
    private ArrayList<Item> inventory;

    /**
     * Constructs the game and prepares required resources.
     */
    public Game() {
        input = new Scanner(System.in);
        running = true;
        party = new ArrayList<>();
        inventory = new ArrayList<>();
    }

    /**
     * Starts the game loop.
     */
    public void start() {
        Utils.printHeader("Welcome to the Java EPIC Final Project");

        while (running) {
            displayMenu();
            int choice = Utils.readInt(input, "Enter your choice: ");

            switch (choice) {
                case 1:
                    createPlayer();
                    break;
                case 2:
                    chooseGameMode();
                    break;
                case 3:
                    viewPlayer();
                    break;
                case 4:
                    addCharacter();
                    break;
                case 5:
                    viewCharacters();
                    break;
                case 6:
                    addItem();
                    break;
                case 7:
                    viewInventory();
                    break;
                case 8:
                    runPlaceholderAction();
                    break;
                case 9:
                    exitGame();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid menu option.");
            }
        }

        input.close();
    }

    /**
     * Displays the main menu.
     */
    private void displayMenu() {
        System.out.println();
        System.out.println("========== MAIN MENU ==========");
        System.out.println("1. Create Player");
        System.out.println("2. Choose Game Theme");
        System.out.println("3. View Player");
        System.out.println("4. Add Character");
        System.out.println("5. View Characters");
        System.out.println("6. Add Item");
        System.out.println("7. View Inventory");
        System.out.println("8. Start Placeholder Action");
        System.out.println("9. Exit");
        System.out.println("================================");
    }

    /**
     * Creates a player if one does not already exist.
     */
    private void createPlayer() {
        if (player != null) {
            System.out.println("A player has already been created.");
            return;
        }

        String name = Utils.readNonEmptyString(input, "Enter your player name: ");
        player = new Player(name);

        System.out.println("Player created successfully.");
        System.out.println("Welcome, " + player.getName() + "!");
    }

    /**
     * Allows the user to choose a theme for the project.
     */
    private void chooseGameMode() {
        if (player == null) {
            System.out.println("Create a player first before choosing a theme.");
            return;
        }

        System.out.println();
        System.out.println("Choose your theme:");
        System.out.println("1. Fantasy Dungeon");
        System.out.println("2. Cyber Hacker");
        System.out.println("3. Space Explorer");

        int choice = Utils.readInt(input, "Enter your theme choice: ");

        switch (choice) {
            case 1:
                player.setGameMode(GameMode.FANTASY_DUNGEON);
                break;
            case 2:
                player.setGameMode(GameMode.CYBER_HACKER);
                break;
            case 3:
                player.setGameMode(GameMode.SPACE_EXPLORER);
                break;
            default:
                System.out.println("Invalid theme choice.");
                return;
        }

        System.out.println("Theme selected: " + player.getGameMode().getDisplayName());
    }

    /**
     * Displays current player information.
     */
    private void viewPlayer() {
        if (player == null) {
            System.out.println("No player has been created yet.");
            return;
        }

        Utils.printHeader("PLAYER INFO");
        System.out.println("Name: " + player.getName());
        System.out.println("Level: " + player.getLevel());
        System.out.println("Theme: " + (player.getGameMode() == null
                ? "Not selected"
                : player.getGameMode().getDisplayName()));
        System.out.println("Party size: " + party.size());
        System.out.println("Items carried: " + inventory.size());
    }

    /**
     * Creates a Character from user input and stores it in the party list.
     */
    private void addCharacter() {
        if (player == null) {
            System.out.println("Create a player first before adding characters.");
            return;
        }

        String name = Utils.readNonEmptyString(input, "Enter character name: ");
        int power = Utils.readInt(input, "Enter character power (1-100): ");

        if (power < 1 || power > 100) {
            System.out.println("Power must be between 1 and 100. Character not added.");
            return;
        }

        Character character = new Character(name, power);
        party.add(character);

        System.out.println(name + " has joined your party!");
    }

    /**
     * Displays every character stored in the party list.
     */
    private void viewCharacters() {
        if (party.isEmpty()) {
            System.out.println("Your party is empty. Add a character first.");
            return;
        }

        Utils.printHeader("PARTY MEMBERS");
        for (int i = 0; i < party.size(); i++) {
            System.out.println((i + 1) + ". " + party.get(i).getSummary());
        }
    }

    /**
     * Creates an Item from user input and stores it in the inventory list.
     */
    private void addItem() {
        if (player == null) {
            System.out.println("Create a player first before adding items.");
            return;
        }

        String name = Utils.readNonEmptyString(input, "Enter item name: ");
        String type = Utils.readNonEmptyString(input, "Enter item type (Weapon, Tool, Artifact...): ");
        int value = Utils.readInt(input, "Enter item value: ");

        if (value < 0) {
            System.out.println("Value cannot be negative. Item not added.");
            return;
        }

        Item item = new Item(name, type, value);
        inventory.add(item);

        System.out.println(name + " was added to your inventory.");
    }

    /**
     * Displays every item stored in the inventory list.
     */
    private void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Your inventory is empty. Add an item first.");
            return;
        }

        Utils.printHeader("INVENTORY");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println((i + 1) + ". " + inventory.get(i).getSummary());
        }
    }

    /**
     * Placeholder method students can replace with real features later.
     */
    private void runPlaceholderAction() {
        if (player == null) {
            System.out.println("Create a player first.");
            return;
        }

        System.out.println(player.getName() + " is getting ready for future missions...");
        System.out.println("This is a placeholder for later gameplay features.");
    }

    /**
     * Ends the game loop.
     */
    private void exitGame() {
        System.out.println("Exiting program. Thanks for playing.");
        running = false;
    }
}