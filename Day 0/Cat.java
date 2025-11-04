public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = moodLevel;
        this.catId = catId;
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
        this.isHungry = true;
    }

    public Cat() {
        this.name = "Cookie";
        this.ownerName = "Lopez";
        this.moodLevel = 5;
        this.catId = "1435";
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
        this.isHungry = true;
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

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        int mood = PurrfectUtils.validateMoodLevel(moodLevel);
        this.moodLevel = mood;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        String catNum = PurrfectUtils.validateCatId(catId);
        this.catId = catNum;
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public String generateCatTag() {
        String catTag = catId + catChar;
        return catTag;
    }

    public String toString() {
        return "== ABOUT " + name + " ==\n" + name 
            + " is a cat.\nTheir tag is " + generateCatTag() 
            + ".\n" + PurrfectUtils.determineCatMood(this); 
    }

    public boolean equals(Cat other) {
        if (this.name.equals(other.name) 
            && this.ownerName.equals(other.ownerName) 
            && this.moodLevel == other.moodLevel 
            && this.catId.equals(other.catId) 
            && this.catChar == other.catChar 
            && this.isHungry == other.isHungry) {
                return true;
        } else {
            return false;
        }
    }

    
}
