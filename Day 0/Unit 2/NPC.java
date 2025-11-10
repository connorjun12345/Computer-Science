public class NPC {
    private String choice;

    public NPC(String choice) {
        this.choice = RPSGame.generateRandomChoice(choice);
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String toString() {
        return "Opponent chose " + choice + ".";
    }

    
}
