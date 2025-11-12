import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;
    private Scanner scanner;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
        scanner = new Scanner(System.in);
    }

    
    public void start() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter rock, paper, or scissors: ");
        String choice = scanner.nextLine();
        choice = choice.toLowerCase();

        int attempts = 1;
        while (validateChoice(choice)  == false && attempts < 3) {
            System.out.println("Invalid choice. Please try again: ");
            choice = scanner.nextLine();
            choice = choice.toLowerCase();
            attempts += 1;
        }


        if (validateChoice(choice) == false) {
            choice = generateRandomChoice();
            System.out.println("3 attempts are invalid - random choice assigned: " + choice);
        }

        setPlayerValues(name, choice);
   

        // Scanner scanner2 = new Scanner(System.in);
        // String choice = scanner2.next();
        // choice = choice.toLowerCase();
        // while (!choice.equals("rock") || !choice.equals("paper") || !choice.equals("scissors")) {
        //     validateChoice(choice);
        // }
        // scanner2.close();
        //scanner.close();
    }

    public boolean didPlayerWin() {
        String playerChoice = player.getChoice();
        String NPC = opponent.getChoice();

        if (playerChoice == "rock" && NPC.equals("scissors")) {
            return true;
        } 
        else if (playerChoice == "paper" && NPC.equals("rock")) {
            return true;
        }
        else if (playerChoice.equals(NPC)) {
            return false;
        }
        else if (playerChoice == "scissors" && NPC.equals("paper")) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (didPlayerWin() == true) {
            return player.getName() + " won!\nCongradulations!";
        } else {
            return "Opponent won!\nBetter luck next time!";
        }
    }

    public String displayResults() {
        if (didPlayerWin() == true) {
            return "== GAME RESULTS ==\n" 
                + player.getName() 
                + " chose " 
                + player.getChoice() 
                + ".\nOpponent chose " 
                + opponent.getChoice() 
                + ".\n" 
                + player.getName() 
                + " won!\nCongradulations!"; 
        } else {
            return "== GAME RESULTS ==\n" 
                + player.getName()
                + " chose " 
                + player.getChoice() 
                + ".\nOpponent chose " 
                + opponent.getChoice() 
                + ".\nOpponent won!\nBetter luck next time!";
        }
        
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }
    
    public static boolean validateChoice(String choice) {
        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
            return true;
        } else {
            return false;
        }
    }


    public static String generateRandomChoice() {
        int number = (int) (Math.random()* 3 + 1);
        if (number == 1) {
            return "rock";
        } else if (number == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }

}
