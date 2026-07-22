import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner scanner;
    private Random random;

    private ArrayList<GameCharacter> characters;

    private Inventory inventory;

    private GameCharacter activeCharacter;

    // Constructor
    public Game() {

        scanner = new Scanner(System.in);
        random = new Random();

        characters = new ArrayList<>();

        inventory = new Inventory();

        activeCharacter = null;

    }
    // Main Game Menu
    public void startGame() {

        int choice;

        do {

            System.out.println();
            System.out.println("========================================");
            System.out.println("      Wizarding World Adventure");
            System.out.println("========================================");
            System.out.println("1. Create Character");
            System.out.println("2. View Characters");
            System.out.println("3. Select Active Character");
            System.out.println("4. Begin Adventure");
            System.out.println("5. View Inventory");
            System.out.println("6. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    createCharacter();
                    break;

                case 2:
                    viewCharacters();
                    break;

                case 3:
                    selectActiveCharacter();
                    break;

                case 4:
                    beginAdventure();
                    break;

                case 5:
                    inventory.displayItems();
                    break;

                case 6:
                    System.out.println();
                    System.out.println("Thank you for playing Wizarding World Adventure!");
                    displayGameSummary();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");

            }

        } while (choice != 6);

    }
    // Create a Character
    private void createCharacter() {

        System.out.println();
        System.out.println("========== Create Character ==========");

        System.out.print("Enter character name: ");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("Choose a Character Class:");
        System.out.println("1. Student");
        System.out.println("2. Auror");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        GameCharacter character = null;

        switch (choice) {

            case 1:

                System.out.println();
                System.out.println("Choose a Hogwarts House:");
                System.out.println("1. Gryffindor");
                System.out.println("2. Ravenclaw");
                System.out.println("3. Hufflepuff");
                System.out.println("4. Slytherin");
                System.out.print("Enter your choice: ");

                int houseChoice = scanner.nextInt();
                scanner.nextLine();

                String house;

                switch (houseChoice) {

                    case 1:
                        house = "Gryffindor";
                        break;

                    case 2:
                        house = "Ravenclaw";
                        break;

                    case 3:
                        house = "Hufflepuff";
                        break;

                    case 4:
                        house = "Slytherin";
                        break;

                    default:
                        house = "Gryffindor";
                        break;

                }

                character = new Student(name, 1, house);
                break;

            case 2:

                System.out.println();
                System.out.println("Choose a Mentor:");
                System.out.println("1. Harry Potter");
                System.out.println("2. Kingsley Shacklebolt");
                System.out.println("3. Nymphadora Tonks");
                System.out.println("4. Alastor Moody");
                System.out.print("Enter your choice: ");

                int mentorChoice = scanner.nextInt();
                scanner.nextLine();

                String mentor;

                switch (mentorChoice) {

                    case 1:
                        mentor = "Harry Potter";
                        break;

                    case 2:
                        mentor = "Kingsley Shacklebolt";
                        break;

                    case 3:
                        mentor = "Nymphadora Tonks";
                        break;

                    case 4:
                        mentor = "Alastor Moody";
                        break;

                    default:
                        mentor = "Harry Potter";
                        break;

                }

                character = new Auror(name, 1, mentor);
                break;

            default:

                System.out.println("Invalid class selection.");
                return;

        }

        characters.add(character);

        // Automatically select the first character created
        if (activeCharacter == null) {

            activeCharacter = character;

        }

        System.out.println();
        System.out.println(character.getName() + " has been created successfully!");
        System.out.println("Current Character: " + activeCharacter.getName());

    }
    // View All Characters
    private void viewCharacters() {

        System.out.println();
        System.out.println("========== Your Characters ==========");

        if (characters.isEmpty()) {

            System.out.println("No characters have been created.");
            return;

        }

        for (int i = 0; i < characters.size(); i++) {

            GameCharacter character = characters.get(i);

            System.out.println();
            System.out.println((i + 1) + ". " + character.getName());

            if (character instanceof Student) {

                Student student = (Student) character;

                System.out.println("Class: Student");
                System.out.println("House: " + student.getHouse());

            }

            else if (character instanceof Auror) {

                Auror auror = (Auror) character;

                System.out.println("Class: Auror");
                System.out.println("Mentor: " + auror.getMentor());

            }

            System.out.println("Level: " + character.getLevel());
            System.out.println("Health: " + character.getHealth());
            System.out.println("Experience: " + character.getExperience());
            System.out.println("Gold: " + character.getGold());

            if (character == activeCharacter) {

                System.out.println("*** ACTIVE CHARACTER ***");

            }

        }

        System.out.println();
        System.out.println("=====================================");

    }
    // Select the Active Character
    private void selectActiveCharacter() {

        if (characters.isEmpty()) {

            System.out.println();
            System.out.println("No characters have been created.");
            return;

        }

        System.out.println();
        System.out.println("========== Select Character ==========");

        for (int i = 0; i < characters.size(); i++) {

            System.out.println((i + 1) + ". " + characters.get(i).getName());

        }

        System.out.print("Enter character number: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice < 1 || choice > characters.size()) {

            System.out.println("Invalid selection.");
            return;

        }

        activeCharacter = characters.get(choice - 1);

        System.out.println();
        System.out.println(activeCharacter.getName() + " is now your active character!");

        System.out.println();

        if (activeCharacter instanceof Student) {

            Student student = (Student) activeCharacter;

            System.out.println("Class: Student");
            System.out.println("House: " + student.getHouse());

        }

        else if (activeCharacter instanceof Auror) {

            Auror auror = (Auror) activeCharacter;

            System.out.println("Class: Auror");
            System.out.println("Mentor: " + auror.getMentor());

        }

        System.out.println("Level: " + activeCharacter.getLevel());

    }
    // Begin Adventure
    private void beginAdventure() {

        if (activeCharacter == null) {

            System.out.println();
            System.out.println("Please create and select a character first.");
            return;

        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("Beginning Adventure...");
        System.out.println("Good luck, " + activeCharacter.getName() + "!");
        System.out.println("========================================");

        if (activeCharacter instanceof Student) {

            studentAdventure();

        }

        else if (activeCharacter instanceof Auror) {

            aurorAdventure();

        }

    }
    // Student Adventures
    private void studentAdventure() {

        Student student = (Student) activeCharacter;

        Enemy enemy = null;

        int adventure = random.nextInt(4);

        System.out.println();

        switch (adventure) {

            case 0:

                System.out.println("========================================");
                System.out.println("Forbidden Forest");
                System.out.println("========================================");
                System.out.println("You enter the Forbidden Forest.");
                System.out.println("An Acromantula jumps from the trees!");

                enemy = new Enemy(
                        "Acromantula",
                        60,
                        15,
                        50,
                        25);

                break;

            case 1:

                System.out.println("========================================");
                System.out.println("Hogsmeade");
                System.out.println("========================================");
                System.out.println("A Mountain Troll is attacking the village!");

                enemy = new Enemy(
                        "Mountain Troll",
                        90,
                        20,
                        75,
                        50);

                break;

            case 2:

                System.out.println("========================================");
                System.out.println("Astronomy Tower");
                System.out.println("========================================");
                System.out.println("A Dementor appears in the darkness!");

                enemy = new Enemy(
                        "Dementor",
                        80,
                        18,
                        70,
                        40);

                break;

            case 3:

                System.out.println("========================================");
                System.out.println("Chamber Corridor");
                System.out.println("========================================");
                System.out.println("A Basilisk Hatchling blocks your path!");

                enemy = new Enemy(
                        "Basilisk Hatchling",
                        70,
                        16,
                        60,
                        35);

                break;

        }

        enemy.displayEnemy();

        battleEnemy(enemy);

        if (!enemy.isAlive()) {

            student.applyHouseBonus();

        }

    }
    // Auror Adventures
    private void aurorAdventure() {

        Auror auror = (Auror) activeCharacter;

        Enemy enemy = null;

        int mission = random.nextInt(4);

        System.out.println();

        switch (mission) {

            case 0:

                System.out.println("========================================");
                System.out.println("Mission: Capture Bellatrix Lestrange");
                System.out.println("========================================");
                System.out.println("Bellatrix has escaped Azkaban!");
                System.out.println("Defeat her and return her to prison!");

                enemy = new Enemy(
                        "Bellatrix Lestrange",
                        120,
                        25,
                        125,
                        150);

                break;

            case 1:

                System.out.println("========================================");
                System.out.println("Mission: Raid Knockturn Alley");
                System.out.println("========================================");
                System.out.println("A Death Eater Captain attacks!");

                enemy = new Enemy(
                        "Death Eater Captain",
                        100,
                        22,
                        100,
                        100);

                break;

            case 2:

                System.out.println("========================================");
                System.out.println("Mission: Protect Diagon Alley");
                System.out.println("========================================");
                System.out.println("Fenrir Greyback attacks innocent witches and wizards!");

                enemy = new Enemy(
                        "Fenrir Greyback",
                        110,
                        24,
                        115,
                        125);

                break;

            case 3:

                System.out.println("========================================");
                System.out.println("Mission: Escort Prisoner to Azkaban");
                System.out.println("========================================");
                System.out.println("An escaped prisoner ambushes your convoy!");

                enemy = new Enemy(
                        "Escaped Prisoner",
                        90,
                        20,
                        90,
                        75);

                break;

        }

        enemy.displayEnemy();

        battleEnemy(enemy);

        if (!enemy.isAlive()) {

            auror.applyMentorBonus();

        }

    }
    // Battle System
    private void battleEnemy(Enemy enemy) {

        System.out.println();
        System.out.println("========== BATTLE START ==========");

        while (activeCharacter.getHealth() > 0 && enemy.isAlive()) {

            System.out.println();
            System.out.println(activeCharacter.getName() + " Health: "
                    + activeCharacter.getHealth());

            System.out.println(enemy.getName() + " Health: "
                    + enemy.getHealth());

            System.out.println();
            System.out.println("1. Cast Spell");
            System.out.println("2. Use Healing Potion");
            System.out.println("3. View Character Stats");
            System.out.println("4. Run Away");
            System.out.print("Choose an action: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    int damage = 20;

                    if (activeCharacter instanceof Student) {

                        damage = ((Student) activeCharacter).attack();

                    }

                    else if (activeCharacter instanceof Auror) {

                        damage = ((Auror) activeCharacter).attack();

                    }

                    enemy.loseHealth(damage);

                    System.out.println();
                    System.out.println(activeCharacter.getName()
                            + " casts a spell!");

                    System.out.println("You dealt "
                            + damage + " damage!");

                    if (!enemy.isAlive()) {

                        break;

                    }

                    activeCharacter.loseHealth(enemy.getAttackPower());

                    System.out.println(enemy.getName()
                            + " attacks back!");

                    System.out.println("You take "
                            + enemy.getAttackPower()
                            + " damage!");

                    break;

                case 2:

                    inventory.useHealingPotion(activeCharacter);

                    break;

                case 3:

                    activeCharacter.displayStats();

                    break;

                case 4:

                    System.out.println();
                    System.out.println("You escaped safely!");

                    return;

                default:

                    System.out.println("Invalid choice.");

            }

        }

        if (activeCharacter.getHealth() <= 0) {

            System.out.println();
            System.out.println("==================================");
            System.out.println("You were defeated...");
            System.out.println("Game Over.");
            System.out.println("==================================");

            return;

        }

        System.out.println();
        System.out.println("==================================");
        System.out.println("Victory!");
        System.out.println("You defeated " + enemy.getName() + "!");
        System.out.println("==================================");

        activeCharacter.gainExperience(enemy.getExperienceReward());
        activeCharacter.gainGold(enemy.getGoldReward());
        activeCharacter.defeatedEnemy();

        giveRandomReward();

    }
    // Give a Random Reward
    private void giveRandomReward() {

        int reward = random.nextInt(6);

        Item item;

        switch (reward) {

            case 0:

                item = new Item(
                        "Healing Potion",
                        "Potion",
                        50);

                break;

            case 1:

                item = new Item(
                        "Chocolate Frog",
                        "Food",
                        20);

                break;

            case 2:

                item = new Item(
                        "Phoenix Feather",
                        "Treasure",
                        200);

                break;

            case 3:

                item = new Item(
                        "Spell Book",
                        "Magic Item",
                        150);

                break;

            case 4:

                item = new Item(
                        "Magic Wand",
                        "Weapon",
                        300);

                break;

            default:

                item = new Item(
                        "Ministry Badge",
                        "Quest Item",
                        500);

                break;

        }

        inventory.addItem(item);

        System.out.println();
        System.out.println("==================================");
        System.out.println("          REWARD");
        System.out.println("==================================");
        System.out.println("You found:");
        item.displayItem();
        System.out.println("==================================");

    }
    // Display Game Summary
    private void displayGameSummary() {

        System.out.println();

        System.out.println("========================================");
        System.out.println("           GAME SUMMARY");
        System.out.println("========================================");

        if (activeCharacter == null) {

            System.out.println("No character was created.");

        }

        else {

            System.out.println("Character: " + activeCharacter.getName());

            if (activeCharacter instanceof Student) {

                Student student = (Student) activeCharacter;

                System.out.println("Class: Student");
                System.out.println("House: " + student.getHouse());

            }

            else if (activeCharacter instanceof Auror) {

                Auror auror = (Auror) activeCharacter;

                System.out.println("Class: Auror");
                System.out.println("Mentor: " + auror.getMentor());

            }

            System.out.println("Level: " + activeCharacter.getLevel());
            System.out.println("Experience: " + activeCharacter.getExperience());
            System.out.println("Health: " + activeCharacter.getHealth());
            System.out.println("Gold: " + activeCharacter.getGold());
            System.out.println("Enemies Defeated: "
                    + activeCharacter.getEnemiesDefeated());

            System.out.println("Inventory Items: "
                    + inventory.getItemCount());

        }

        System.out.println("========================================");
        System.out.println("Thanks for playing Wizarding World Adventure!");
        System.out.println("========================================");

    }

}