public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;


    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = generateDogChar();
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public Dog() {
        this.dogChar = generateDogChar();
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getOwnerName() {
        return ownerName;
    }


    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getDogId() {
        return dogId;
    }


    public void setDogId(int dogId) {
        this.dogId = dogId;
    }


    public char getDogChar() {
        return dogChar;
    }


    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }


    public String getDogTag() {
        return dogTag;
    }


    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }


    public boolean isStillInFacility() {
        return stillInFacility;
    }


    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        return (name + " is a good dog. They are " + age + " years old and belong to " + ownerName + 
            ". They are " + stillInFacility + " . For employee use only: DogTag is " + dogTag + ".");
    }

    public boolean equals(Dog other) {
        if (this.name.equals(other.name) && 
            this.ownerName.equals(other.ownerName) && 
            this.age == other.age && 
            this.dogTag == other.dogTag &&
            this.stillInFacility == other.stillInFacility) {
                return true;
            } else {
                return false;
            }
    }
    
    public String generateDogTag() {
        String generateDogTag = "" + dogId + dogChar;
        return generateDogTag;
    }

    public char generateDogChar() {
        int x = (dogId / 100) % 10;
        int y = (dogId / 10 ) % 10;
        int z = (dogId % 10);
        int sum = x + y + z;
        return (char) ('F' + (sum % 10));

    }




}
