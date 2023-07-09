/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author renug
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Register with game using the username: ");
        String username = scanner.nextLine();

        HillClimbingGame game = new HillClimbingGame(username);
        User user = game.getUser();

        System.out.println("Welcome, " + user.getUsername() + "! Let's start the game.");

        // Game logic and user interactions

        // Simulating game completion and updating user's score
        game.communicateResult(true);
        user.increaseScore(100);

        // Displaying updated user information
        System.out.println("Username: " + user.getUsername());
        System.out.println("Score: " + user.getScore());

        // Level up
        game.increaseLevel();
        int level = game.getLevel();
        System.out.println("Level: " + level);
    }
}
