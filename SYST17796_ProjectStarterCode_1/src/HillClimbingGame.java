/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renug
 */


public class HillClimbingGame {
    private User user;
    private int level;
    // Additional game-related variables and methods

    public HillClimbingGame(String username) {
        this.user = new User(username);
        this.level = 1;
        // Initialize other game-related variables
    }

    public User getUser() {
        return user;
    }

    public int getLevel() {
        return level;
    }

    public void increaseLevel() {
        level++;
        // Additional level-up logic
    }

    // Other game-related methods, such as starting a new game, updating game progress, etc.
}