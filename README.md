# Java EPIC Final Project Starter

Welcome to the **Java EPIC Final Project**.

In this project you will build a multi-class Java application over several weeks while using **GitHub to track your development progress**.

This repository includes starter code, project structure, and workflow guidance to help you build your final program step-by-step.

---

# Project Goal

Create a **multi-class Java console application** such as:

• a game  
• a simulator  
• an interactive system  

Your project should grow each week as you apply new Java concepts from the course.

The goal is not to build everything at once, but to **develop your program incrementally**.

---

# Current Progress

**Latest completed milestone:** Week 2 – Core Actions (`week2-core-actions`)

### Features implemented so far

- Main menu loop with safe input handling
- Player creation
- Theme selection using the `GameMode` enum
- View player info (name, level, theme, party size, items carried)
- **Add and view characters** stored in an `ArrayList<Character>`
- **Add and view items** stored in an `ArrayList<Item>`

### Current main menu

```
========== MAIN MENU ==========
1. Create Player
2. Choose Game Theme
3. View Player
4. Add Character
5. View Characters
6. Add Item
7. View Inventory
8. Start Placeholder Action
9. Exit
================================
```

### Classes

| Class | Purpose |
|------|------|
| `Main` | Entry point; creates a `Game` and starts it |
| `Game` | Main menu, game loop, and the `party` and `inventory` collections |
| `Player` | Stores the player's name, level, and selected theme |
| `GameMode` | Enum of available themes |
| `Character` | A party member with a name and power |
| `Item` | An inventory item with a name, type, and value (new in Week 2) |
| `Mission` | Starter class for missions (to be used in later weeks) |
| `Utils` | Helper methods for headers and safe input |

### Coming next

- **Week 3:** Subclasses of `Character` (inheritance and polymorphism)
- **Week 4:** Game logic and state changes
- **Week 5:** Final build and polish

---

# Quick Start

Follow these steps to begin your project:

1. **Fork this repository** to your own GitHub account.
2. **Clone your fork** to your computer.
3. Open the project in **Eclipse**.
4. Run `Main.java` to confirm the starter code works.
5. Create your **Week 1 branch**.
6. Begin implementing your weekly deliverables.

---
# Weekly Instructions

[Week 1 - Deliverable Instructions](docs/week1-deliverables.md)

[Week 2 - Deliverable Instructions](docs/week2-deliverables.md)

[Week 3 - Deliverable Instructions](docs/week3-deliverables.md)

[Week 4 - Deliverable Instructions](docs/week4-deliverables.md)

[Week 5 - Deliverable Instructions](docs/week5-final-build.md)

---

# Weekly Workflow

Each week you will:

1. Create a new **branch**
2. Develop your project features
3. Commit your work
4. Push your changes to GitHub
5. Submit your branch in Canvas

This workflow allows your instructor to:

• see your development progress  
• review your code changes  
• track how your project evolves  

---

# Weekly Branch Names

Use the following branch names for each deliverable:
```
week1-structure
week2-core-actions
week3-collections
week4-game-logic
final-build
```

Do **not work directly in the `main` branch** until the final submission.

---

# Weekly Development Process

Detailed instructions for the GitHub workflow are located here:
```docs/github-survival-guide.md```

This guide walks you through:

• forking  
• cloning  
• creating branches  
• committing code  
• pushing to GitHub  

---

# Important Starter Code Notes

You may **add new classes and methods as needed**, but you should NOT:

- remove `Main.java`
- remove `Game.java`
- rename existing starter files
- delete the starter structure

Your job is to **extend the system**, not rebuild it.

---

# Submit Your Deliverable in Canvas

Your Canvas submission must include:

- GitHub repository link 
  - Screenshots of the program running should be available in the screenshots folder
  - Please name the screenshots appropriately
    
- Branch name used for the deliverable  
- Short description of your progress  

Example submission:
```
Repository:
https://github.com/yourusername/java-final-project

Branch:
week2-core-actions

Description:
Added Item class.
Stored characters and items in ArrayLists.
Added menu options to add and view them.
Program compiles and runs.
```

---

# Commit Expectations

Your repository should show **consistent progress throughout the week**.

Minimum commits per week:
```**3 commits**```

Example commit history:
- Added Item class
- Added party and inventory ArrayLists
- Added menu options to add and view characters and items

Avoid committing everything at the last minute.

GitHub should show the **development process**, not just the final result.

---

# Recommended Folder Structure
```
src/ → Java source files
docs/ → design notes and reflections
screenshots/ → screenshots of your progress
```

---

# Running the Program

To run the project:

1. Open the project in Eclipse
2. Locate `Main.java`
3. Run the program

The application should launch in the console.

---

# Final Submission

Your final submission must include:

- Completed project in the `main` branch  
- Final screenshot or demo in the screenshots folder
- All required project features implemented  

---



Build your project step-by-step, test frequently, and commit your progress regularly.

Good luck and have fun building your EPIC project.