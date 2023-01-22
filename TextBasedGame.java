import java.util.Scanner;

public class TextBasedGame {

    public static void main(String[] args) {
        // Initialize the game
        Scanner input = new Scanner(System.in);
        String playerName = "";
        int playerHealth = 100;
        int playerLevel = 1;
        int playerExperience = 0;

        // Greet the player and get their name
        System.out.println("Welcome to the Text-Based Game!");
        System.out.print("What is your name? ");
        playerName = input.nextLine();

        // Main game loop
        boolean playing = true;
        while (playing) {
            // Display the player's stats
            System.out.println("\n" + playerName + ", Level " + playerLevel + ":");
            System.out.println("Health: " + playerHealth);
            System.out.println("Experience: " + playerExperience);

            // Display the main menu
            System.out.println("\nMain Menu:");
            System.out.println("1. Explore the forest");
            System.out.println("2. Visit the town");
            System.out.println("3. Rest at the inn");
            System.out.println("4. Quit the game");

            // Get the player's choice
            System.out.print("\nWhat would you like to do? ");
            int choice = input.nextInt();

            // Handle the player's choice
            if (choice == 1) {
                // Explore the forest
                System.out.println("\nYou venture into the forest...");
                System.out.println("You find a treasure chest filled with gold!");
                playerExperience += 50;
            } else if (choice == 2) {
                // Visit the town
                System.out.println("\nYou head to the town...");
                System.out.println("You meet a wise old man who gives you advice.");
                playerExperience += 25;
            } else if (choice == 3) {
                // Rest at the inn
                System.out.println("\nYou rest at the inn...");
                playerHealth = 100;
            } else if (choice == 4) {
                // Quit the game
                playing = false;
                System.out.println("\nThanks for playing!");
            } else {
                // Invalid choice
                System.out.println("\nInvalid choice. Please try again.");
            }
        }

        input.close();
    }
}
