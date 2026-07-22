public class Student extends GameCharacter {

    private String house;

    // Constructor
    public Student(String name, int level, String house) {

        super(name, level);
        this.house = house;

    }

    // Getter
    public String getHouse() {

        return house;

    }

    // Setter
    public void setHouse(String house) {

        this.house = house;

    }

    // Student attack damage
    public int attack() {

        switch (house) {

            case "Gryffindor":
                return 30;

            case "Ravenclaw":
                return 28;

            case "Slytherin":
                return 26;

            case "Hufflepuff":
                return 22;

            default:
                return 20;

        }

    }

    // Special ability
    @Override
    public void performSpecialAbility() {

        System.out.println();
        System.out.println("=================================");
        System.out.println(name + " of " + house + " House");
        System.out.println("=================================");

        switch (house) {

            case "Gryffindor":

                System.out.println("Special Ability:");
                System.out.println("Sword of Gryffindor Strike!");
                System.out.println("Attack Damage: 30");
                System.out.println("Passive Bonus: Restore 5 Health after each victory.");
                break;

            case "Ravenclaw":

                System.out.println("Special Ability:");
                System.out.println("Ancient Knowledge!");
                System.out.println("Attack Damage: 28");
                System.out.println("Passive Bonus: Earn bonus experience.");
                break;

            case "Hufflepuff":

                System.out.println("Special Ability:");
                System.out.println("Loyal Defense!");
                System.out.println("Attack Damage: 22");
                System.out.println("Passive Bonus: Take less damage from enemies.");
                break;

            case "Slytherin":

                System.out.println("Special Ability:");
                System.out.println("Serpent's Cunning!");
                System.out.println("Attack Damage: 26");
                System.out.println("Passive Bonus: Earn extra Galleons after missions.");
                break;

            default:

                System.out.println("Basic Spell");
                break;

        }

    }

    // House bonus after winning
    public void applyHouseBonus() {

        switch (house) {

            case "Gryffindor":

                heal(5);

                System.out.println();
                System.out.println("House Bonus!");
                System.out.println("You restored 5 Health.");
                break;

            case "Ravenclaw":

                gainExperience(10);

                System.out.println();
                System.out.println("House Bonus!");
                System.out.println("You gained 10 bonus XP.");
                break;

            case "Hufflepuff":

                System.out.println();
                System.out.println("House Bonus!");
                System.out.println("Your loyalty makes you more resilient.");
                break;

            case "Slytherin":

                gainGold(25);

                System.out.println();
                System.out.println("House Bonus!");
                System.out.println("You earned 25 bonus Galleons.");
                break;

        }

    }

    // Display student information
    @Override
    public void displayStats() {

        super.displayStats();

        System.out.println("Class: Hogwarts Student");
        System.out.println("House: " + house);

    }

}