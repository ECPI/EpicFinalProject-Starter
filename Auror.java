public class Auror extends GameCharacter {

    private String mentor;

    // Constructor
    public Auror(String name, int level, String mentor) {

        super(name, level);
        this.mentor = mentor;

    }

    // Getter
    public String getMentor() {

        return mentor;

    }

    // Setter
    public void setMentor(String mentor) {

        this.mentor = mentor;

    }

    // Attack Damage
    public int attack() {

        switch (mentor) {

            case "Harry Potter":
                return 35;

            case "Kingsley Shacklebolt":
                return 32;

            case "Nymphadora Tonks":
                return 30;

            case "Alastor Moody":
                return 38;

            default:
                return 25;

        }

    }

    // Special Ability
    @Override
    public void performSpecialAbility() {

        System.out.println();
        System.out.println("=================================");
        System.out.println(name + " the Auror");
        System.out.println("=================================");
        System.out.println("Mentor: " + mentor);

        switch (mentor) {

            case "Harry Potter":

                System.out.println("Special Ability:");
                System.out.println("Expelliarmus!");
                System.out.println("Attack Damage: 35");
                System.out.println("Passive Bonus: Gain 15 bonus XP after each mission.");
                break;

            case "Kingsley Shacklebolt":

                System.out.println("Special Ability:");
                System.out.println("Patronus Blast!");
                System.out.println("Attack Damage: 32");
                System.out.println("Passive Bonus: Earn 50 bonus Galleons after missions.");
                break;

            case "Nymphadora Tonks":

                System.out.println("Special Ability:");
                System.out.println("Metamorphmagus Surprise!");
                System.out.println("Attack Damage: 30");
                System.out.println("Passive Bonus: Restore 10 Health after missions.");
                break;

            case "Alastor Moody":

                System.out.println("Special Ability:");
                System.out.println("Constant Vigilance!");
                System.out.println("Attack Damage: 38");
                System.out.println("Passive Bonus: Deal the highest damage.");
                break;

            default:

                System.out.println("Special Ability:");
                System.out.println("Stunning Spell!");
                break;

        }

    }

    // Mentor Bonus
    public void applyMentorBonus() {

        switch (mentor) {

            case "Harry Potter":

                gainExperience(15);

                System.out.println();
                System.out.println("Mentor Bonus!");
                System.out.println("Harry Potter awarded you 15 bonus XP!");
                break;

            case "Kingsley Shacklebolt":

                gainGold(50);

                System.out.println();
                System.out.println("Mentor Bonus!");
                System.out.println("You earned 50 bonus Galleons!");
                break;

            case "Nymphadora Tonks":

                heal(10);

                System.out.println();
                System.out.println("Mentor Bonus!");
                System.out.println("You restored 10 Health!");
                break;

            case "Alastor Moody":

                System.out.println();
                System.out.println("Mentor Bonus!");
                System.out.println("Constant Vigilance increases your battle effectiveness!");
                break;

        }

    }

    // Display Character Stats
    @Override
    public void displayStats() {

        super.displayStats();

        System.out.println("Class: Auror");
        System.out.println("Mentor: " + mentor);

    }

}