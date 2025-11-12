public class Player {
    private String name;
    private String choice;
   
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return name + " chose " + choice + ".";
    }

    

    
}
