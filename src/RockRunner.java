import java.util.Scanner;

public class RockRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to rock, paper, scissors!");
        System.out.println("Rock beats scissor, scissor beats paper, paper beats rock.");
        System.out.println("The computer has chosen. What's your choice? (rock, paper, scissors)");
        System.out.print("Your choice: ");
        String playerPick = scanner.nextLine();

        Rock game = new Rock(playerPick);
        String cp = game.randomMove();
        System.out.println("Computer choice: " + cp.substring(0, 1).toUpperCase() + cp.substring(1));
        game.findWinner();
    }
}