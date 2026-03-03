public class Squirrel extends Animal {
    private int nuts;
    private boolean inTree;
    private int energyLevel;

    public Squirrel() {
        super();
        this.nuts = (int) (Math.random() * 10);
        this.inTree = false;
        this.energyLevel = (int) (Math.random() * 50 + 50);
        super.setHungry(true);
        super.setAge(5);
    }

    public void makeNoise() {
        System.out.println("Squirrel Noise");
        loseEnergy();
    }

    public void climbTree() {
        if (!inTree) {
            inTree = true;
            loseEnergy();
        } else {
            System.out.println("Squirrel is already in tree!");
        }

    }

    public void collectNut() {
        nuts += 1;
        loseEnergy();
    }

    public void loseEnergy() {
        energyLevel -= 5;
    }

    public String toString() {
        return "Squrrel Stats: \nSquirrel is in tree: " + inTree + "\nSqurrel has " + nuts + "nuts.\nEnergy level: "
                + energyLevel + "Squirrel is hungry: " + super.isHungry() + "\nAge: " + super.getAge();
    }

}