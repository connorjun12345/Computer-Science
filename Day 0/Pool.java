public class Pool {
    private String name;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsChemicalCheck;


    public Pool(String name, String ownerName, int cleanlinesslevel) {
        this.ownerName = ownerName;
        this.username = PoolUtils.generateUsername(name);
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel();
        this.needsChemicalCheck = false;
    }

    public Pool(String name, String ownerName, int cleanlinesslevel, boolean needsChemicalCheck) {
        this.name = "My Pool";
        this.ownerName = "Connor Jun";
        this.username = PoolUtils.generateUsername();
        this.cleanlinessLevel = 5;
        this.needsChemicalCheck = false;
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
        PoolUtils.fixName(ownerName);
        this.ownerName = ownerName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.cleanlinessLevel = cleanlinessLevel;
    }

    public boolean isNeedsChemicalCheck() {
        return needsChemicalCheck;
    }

    public void setNeedsChemicalCheck(boolean needsChemicalCheck) {
        this.needsChemicalCheck = needsChemicalCheck;
    }

    public String toString() {
        return "== ABOUT POOL ==\nName: " 
            + name + "\nOwner: " 
            + ownerName + "\nUsername: " 
            + username + "\nCleanliness Level: " 
            + cleanlinessLevel + "\nDoes pool need chemical check? " 
            + needsChemicalCheck;
    }

    public boolean equals(Pool other) {
        if (this.username.equals(other.username)) {
            if (this.name.equals(other.name) 
                && this.ownerName.equals(other.ownerName) 
                && this.cleanlinessLevel == other.cleanlinessLevel 
                && this.needsChemicalCheck == other.needsChemicalCheck) {
                    return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    
}
