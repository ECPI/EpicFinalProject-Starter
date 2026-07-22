public class Enemy {

    private String name;
    private int health;
    private int attackPower;
    private int experienceReward;
    private int goldReward;

    // Constructor
    public Enemy(String name, int health, int attackPower,
                 int experienceReward, int goldReward) {

        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.experienceReward = experienceReward;
        this.goldReward = goldReward;

    }

    // Getters
    public String getName() {

        return name;

    }

    public int getHealth() {

        return health;

    }

    public int getAttackPower() {

        return attackPower;

    }

    public int getExperienceReward() {

        return experienceReward;

    }

    public int getGoldReward() {

        return goldReward;

    }

    // Setters
    public void setName(String name) {

        this.name = name;

    }

    public void setHealth(int health) {

        this.health = health;

    }

    public void setAttackPower(int attackPower) {

        this.attackPower = attackPower;

    }

    public void setExperienceReward(int experienceReward) {

        this.experienceReward = experienceReward;

    }

    public void setGoldReward(int goldReward) {

        this.goldReward = goldReward;

    }

    // Enemy takes damage
    public void loseHealth(int damage) {

        health -= damage;

        if (health < 0) {

            health = 0;

        }

    }

    // Check if enemy is alive
    public boolean isAlive() {

        return health > 0;

    }

    // Display enemy information
    public void displayEnemy() {

        System.out.println();
        System.out.println("========== ENEMY ==========");
        System.out.println("Enemy: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("XP Reward: " + experienceReward);
        System.out.println("Gold Reward: " + goldReward + " Galleons");
        System.out.println("===========================");

    }

}