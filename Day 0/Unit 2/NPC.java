public class NPC {
    private String choice;

    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        choice = choice.toLowerCase();
        RPSGame.validateChoice(choice);
        if (RPSGame.validateChoice(choice) == false) {
            choice = RPSGame.generateRandomChoice();
        }
        this.choice = choice;
    }

    public String toString() {
        return "Opponent chose " + choice + ".";
    }

    
}
