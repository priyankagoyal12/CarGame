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

    public HillClimbingGame(String username) {
        this.user = new User(username);
        this.level = 1;
    }

    public void communicateResult(boolean hasWon) {
        if (user != null) {
            user.setHasWon(hasWon);
        }
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
