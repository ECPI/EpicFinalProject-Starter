import java.util.Scanner;

/**
 * Controls the main game flow and menu system.
 *
 * Student Notes:
 * - This class handles the main menu and user choices.
 * - Keep major game flow here, and move detailed logic into other classes later.
 */
public class Game {

    private Scanner input;
    private Player player;
    private Mission currentMission;
    private boolean running;

    /**
     * Constructs the game and prepares required resources.
     */
    public Game() {
        input = new Scanner(System.in);
        running = true;
    }

    /**
     * Starts the game loop. Repeats the menu until the user exits.
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
                    startAction();
                    break;
                case 5:
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
        System.out.println("4. Start Action");
        System.out.println("5. Exit");
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

        if (currentMission != null) {
            System.out.println(currentMission.getSummary());
        }
    }

    /**
     * Placeholder gameplay action. Creates a mission that matches the chosen
     * theme and completes it. Replace the body with real gameplay
     * (combat, XP, rewards) in later weeks.
     */
    private void startAction() {
        if (player == null) {
            System.out.println("Create a player first.");
            return;
        }
        if (player.getGameMode() == null) {
            System.out.println("Choose a game theme first.");
            return;
        }

        currentMission = createMissionForTheme(player.getGameMode());

        Utils.printHeader("MISSION START");
        System.out.println(player.getName() + " accepts a new mission!");
        System.out.println(currentMission.getSummary());

        // TODO (future weeks): add combat, events, XP, and rewards here.
        System.out.println("Gameplay features coming in later weeks...");

        currentMission.completeMission();
        System.out.println(currentMission.getSummary());
    }

    /**
     * Builds a placeholder mission based on the selected theme.
     *
     * @param mode the player's chosen game mode
     * @return a new Mission
     */
    private Mission createMissionForTheme(GameMode mode) {
        switch (mode) {
            case FANTASY_DUNGEON:
                return new Mission("Explore the Cave", "Find the lost treasure.");
            case CYBER_HACKER:
                return new Mission("Breach the Firewall", "Access the secure server.");
            case SPACE_EXPLORER:
                return new Mission("Scan the Asteroid Field", "Map a safe route.");
            default:
                return new Mission("Training Mission", "Learn the basics.");
        }
    }

    /**
     * Ends the game loop.
     */
    private void exitGame() {
        System.out.println("Exiting program. Thanks for playing.");
        running = false;
    }
}