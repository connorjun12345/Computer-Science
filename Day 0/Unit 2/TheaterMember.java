public class TheaterMember {
    private String name;
    private boolean[] loyaltyCredits;

    public TheaterMember(String name) {
        this.name = name;
        this.loyaltyCredits = new boolean[10];
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == false) {
                loyaltyCredits[i] = true;
            }
        }
    }

    public int countLoyaltyCredits() {
        int counter = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                counter++;
            }

        }
        return counter;
    }

    public String determineMembershipStatus() {
        if (countLoyaltyCredits() >= 6) {
            return "Gold Member";
        }
        if (countLoyaltyCredits() <= 3 || countLoyaltyCredits() <= 5) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        int visits = countLoyaltyCredits();
        int extra = 10 - visits;
        String start = "[";
        for (int i = 0; i <= visits; i++) {
            start = start + "X, ";
        }
        for (int i = 0; i <= extra; i++) {
            start = start + "-, ";
        }
        return start;
    }

    /////////////////////////

    public String toString() {
        return name + "(" + determineMembershipStatus() + "), Loyalty History: " + loyaltyHistory();
    }

    public boolean equals(TheaterMember other) {
        if (this.name.equals(other.name) && this.loyaltyCredits == other.loyaltyCredits) {
            return true;
        } else {
            return false;
        }
    }

}
