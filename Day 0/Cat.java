public class Cat {//made public lowercase and removed s from cats
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed) { //made cat uppercase and added String Breed to the parameter
		this.name = name;
		this.breed = breed;
		this.isHungry = true;//changed yes to true
		livesRemaining = 9;
	}

	public String getName() { //changed void to String
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public void setBreed(String breed) { //added setter for Breed
        this.breed = breed;
    }

    public String getBreed() { // added getter for breed
        return breed;
    }

	public boolean getIsHungry(){ //changed void to boolean and fized camel case
		return isHungry;
	}

	public void feed() { //changed boolean to void
		this.isHungry = false;
	}

	public boolean equals(Cat other) { //changed = too == and changed into if statement and remove ;
		if (this.name == other.name && this.breed.equals(other.breed) && this.livesRemaining == other.livesRemaining) {
            return true;
        } else {
            return false;
        }
	}

	public String toString() { //changed System.out.println to return
		return (name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.");
	}
}
