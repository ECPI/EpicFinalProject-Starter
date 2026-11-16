# Java EPIC Final Project

A multi-class, console-based Java application that you will build incrementally over five weeks. The starter code gives you a working menu system, a player, and a theme selector. Your job is to extend it into a complete small game or simulator.

---

## Project Goal

Build a **multi-class Java console application** (a game, simulator, or interactive system) that grows each week as you apply new concepts from the course. By the end, your program should demonstrate:

- Multiple interacting classes
- Encapsulation with private fields, getters, and setters
- Inheritance and polymorphism
- Collections such as `ArrayList`
- Game logic that changes program state
- Reliable user input handling

---

## Quick Start

1. **Fork** this repository to your own GitHub account.
2. **Clone** your fork to your computer.
3. Open the project in **Eclipse**.
4. Run `Main.java` to confirm the starter code works.
5. Create your Week 1 branch and begin building.

---

## Running the Program

1. Open the project in Eclipse.
2. Locate `Main.java`.
3. Right-click it and choose **Run As → Java Application**.

The program launches in the console and displays the main menu.

---

## Starter Code Overview

| File | Purpose |
|------|---------|
| `Main.java` | Entry point. Creates a `Game` and starts it. |
| `Game.java` | Controls the main game loop and menu. Most new features will be wired in here. |
| `Player.java` | Stores the player's name, level, and chosen theme. |
| `GameMode.java` | Enum of available themes: Fantasy Dungeon, Cyber Hacker, Space Explorer. |
| `Utils.java` | Reusable helpers, including `printHeader`, `readInt`, and `readNonEmptyString` for safe input. |
| `Character.java` | Basic character with a name and power. Becomes the parent class in Week 3. |
| `Mission.java` | Basic mission with a title and completion status. Useful for Week 4 game logic. |

### Starter Menu

```
========== MAIN MENU ==========
1. Create Player
2. Choose Game Theme
3. View Player
4. Start Placeholder Action
5. Exit
================================
```

### Ground Rules for the Starter Code

You may add new classes and methods freely, but you should **not**:

- Remove `Main.java` or `Game.java`
- Rename existing starter files
- Delete the starter structure

Your job is to **extend** the system, not rebuild it.

---

## Weekly Roadmap

| Week | Focus | Branch | What You Build |
|------|-------|--------|----------------|
| 1 | Program Structure | `week1-structure` | Menu loop, player creation, theme selection, view player info |
| 2 | Core Classes | `week2-core-actions` | New classes, constructors, private fields, objects stored in an `ArrayList`, menu options to create and view them |
| 3 | Inheritance and Polymorphism | `week3-collections` | A `Character` parent class, at least two subclasses with overridden methods, stored in `ArrayList<Character>` |
| 4 | Game Logic | `week4-game-logic` | At least one system that changes state (missions, battles, XP, inventory, etc.), clear output, better input validation |
| 5 | Final Build | `week5-final-build` | Polish, bug fixes, complete features, merge into `main` |

### Week-by-Week Targets

**Week 1:** Program runs from `Main.java`, menu loops until exit, player can be created, a theme can be chosen, and player info displays correctly.

**Week 2:** At least one new class beyond the starter files, objects created through constructors, objects stored in an `ArrayList`, and menu options to add and display them.

**Week 3:** Example hierarchy:

```
Character
 ├ Warrior   → specialAttack()
 ├ Hacker    → hackSystem()
 └ Explorer  → findArtifact()
```

Store subclasses in one collection and call a shared method so each subclass's behavior runs:

```java
ArrayList<Character> party = new ArrayList<>();
party.add(new Warrior("Aragorn"));
party.add(new Hacker("Neo"));

for (Character c : party) {
    c.performAction();
}
```

**Week 4:** Add a meaningful system where an action updates values and shows results, for example:

```
Mission: Explore Cave
Warrior attacks enemy!
Victory!

+50 XP
Health: 75
Credits: 120
```

One well-implemented system is better than several unfinished ones.

**Week 5:** Final feature checklist:

- Working main menu
- Player creation
- Multiple character types with subclass behavior
- Collections storing objects
- Actions that change game state
- Clear console output
- Input validation
- Program runs start to finish without crashing

---

## Git Workflow

Do **not** work directly on `main` until the final submission. Each week follows the same cycle:

1. Create a new branch
2. Develop your features
3. Commit your work
4. Push to GitHub
5. Submit in Canvas

### The Core Commands

| Command | Purpose |
|---------|---------|
| `git clone REPOSITORY_URL` | Download your repository (once) |
| `git checkout -b branch-name` | Create a weekly branch |
| `git add .` | Stage your changes |
| `git commit -m "message"` | Save your work with a description |
| `git push origin branch-name` | Upload your branch to GitHub |

### Example Weekly Cycle

```
git checkout -b week2-core-actions
git add .
git commit -m "Added Character class and party ArrayList"
git push origin week2-core-actions
```

### Final Merge (Week 5)

```
git checkout main
git merge week5-final-build
git push origin main
```

If something looks wrong, `git status` shows what changed and `git log` shows your commit history.

---

## Commit Expectations

Make **at least 3 meaningful commits per week**. Your history should show steady progress, not one large commit at the last minute.

**Good messages**
- Added main menu and start method
- Created Player class with health field
- Implemented inventory using ArrayList
- Fixed invalid menu input handling

**Bad messages**
- update
- stuff
- final
- idk

---

## Repository Structure

```
src/           Java source files
docs/          design notes and reflections
screenshots/   proof of progress
```

---

## Weekly Canvas Submission

Each submission must include:

- **Repository link:** `https://github.com/yourusername/java-epic-final-project`
- **Branch name** used for that week's deliverable
- **Screenshot** of the running program, saved in `screenshots/`
- **Short description** of your progress

Suggested screenshot names:

| Week | File |
|------|------|
| 1 | `screenshots/week1-menu.png` |
| 2 | `screenshots/week2-progress.png` |
| 3 | `screenshots/week3-progress.png` |
| 4 | `screenshots/week4-progress.png` |
| 5 | `screenshots/final-project.png` |

### Example Submission

```
Repository:
https://github.com/yourusername/java-epic-final-project

Branch:
week1-structure

Description:
Created main menu and game loop.
Added GameMode class.
Program compiles and runs.
```

---

## Code Quality Checklist

Before each submission, review your code for:

- Clear variable and method names
- Logical class structure
- Comments explaining important logic
- Consistent formatting
- Minimal duplicate code

---

## Final Submission

Your final submission must include:

- The completed project in the `main` branch
- A final screenshot or demo in `screenshots/`
- All required features implemented
- A completed final reflection

---

## Tips

- Build step by step, test frequently, and commit often.
- A small program that works reliably beats a complicated one that crashes.
- Extend your existing system each week rather than rewriting it.