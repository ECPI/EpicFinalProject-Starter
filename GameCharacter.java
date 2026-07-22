public class GameCharacter {

    // Basic Character Information
    protected String name;
    protected int level;
    protected int health;
    protected int maxHealth;
    protected int experience;
    protected int gold;
    protected int enemiesDefeated;

    // Constructor
    public GameCharacter(String name, int level) {

        this.name = name;
        this.level = level;
        this.maxHealth = 100;
        this.health = maxHealth;
        this.experience = 0;
        this.gold = 0;
        this.enemiesDefeated = 0;

    }

    // Getters
    public String getName() {

        return name;

    }

    public int getLevel() {

        return level;

    }

    public int getHealth() {

        return health;

    }

    public int getMaxHealth() {

        return maxHealth;

    }

    public int getExperience() {

        return experience;

    }

    public int getGold() {

        return gold;

    }

    public int getEnemiesDefeated() {

        return enemiesDefeated;

    }

    // Setters
    public void setName(String name) {

        this.name = name;

    }

    public void setLevel(int level) {

        this.level = level;

    }

    public void setHealth(int health) {

        this.health = health;

    }

    // Character takes damage
    public void loseHealth(int damage) {

        health -= damage;

        if (health < 0) {

            health = 0;

        }

    }

    // Heal character
    public void heal(int amount) {

        health += amount;

        if (health > maxHealth) {

            health = maxHealth;

        }

    }

    // Gain XP
    public void gainExperience(int xp) {

        experience += xp;

        while (experience >= (level * 100)) {

            experience -= (level * 100);

            level++;

            maxHealth += 20;

            health = maxHealth;

            System.out.println();
            System.out.println("********************************");
            System.out.println(name + " leveled up!");
            System.out.println("You are now Level " + level + "!");
            System.out.println("Health fully restored!");
            System.out.println("********************************");
        }

    }

    // Gain Gold
    public void gainGold(int amount) {

        gold += amount;

    }

    // Count defeated enemies
    public void defeatedEnemy() {

        enemiesDefeated++;

    }

    // Is character alive?
    public boolean isAlive() {

        return health > 0;

    }

    // Display Stats
    public void displayStats() {

        System.out.println();
        System.out.println("========== CHARACTER ==========");
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println("Experience: " + experience);
        System.out.println("Gold: " + gold + " Galleons");
        System.out.println("Enemies Defeated: " + enemiesDefeated);
        System.out.println("===============================");

    }

    // Default Ability
    public void performSpecialAbility() {

        System.out.println(name + " casts a magical spell.");

    }

}