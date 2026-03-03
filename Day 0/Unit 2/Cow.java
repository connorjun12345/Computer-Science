public class Cow extends Animal {
    private int galonsOfMilk;
    private int energyLevel;
    private boolean isHungry;
    private int age;

    public Cow() {
        galonsOfMilk = (int) (Math.random() * 50 + 50);
        energyLevel = (int) (Math.random() * 50 + 50);
        isHungry = true;
        age = 5;
    }

    public void milkCow() {
        if (galonsOfMilk > 5) {
            galonsOfMilk -= 5;
            loseEnergy();
        } else {
            loseEnergy();
        }

    }

    public void makeNoise() {
        if (energyLevel > 25) {
            System.out.println("Moooooooooooo!");
            loseEnergy();
        } else {
            System.out.println("I dont wanna moo");
        }
    }

    public void loseEnergy() {
        energyLevel -= 5;
    }

    public String toString() {
        return "Cow Stats:\nEnergy Leve: " + energyLevel + "\nGalons of Milk: " + galonsOfMilk + "\nAge: " + age
                + "\nCow is hungry: " + isHungry;
    }

}