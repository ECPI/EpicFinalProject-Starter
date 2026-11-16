/**
 * Represents a mission or quest in the game.
 *
 * Week 1: A simple placeholder. Later weeks can add rewards (XP, gold),
 * difficulty, and enemies.
 */
public class Mission {

    private String title;
    private String description;
    private boolean completed;

    /**
     * Creates a mission with a title and description.
     *
     * @param title the mission name
     * @param description a short description of the mission
     */
    public Mission(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeMission() {
        completed = true;
    }

    /**
     * Returns a one-line summary of the mission and its status.
     */
    public String getSummary() {
        return "Mission: " + title + " | " + description
                + " | Status: " + (completed ? "Completed" : "In Progress");
    }
}