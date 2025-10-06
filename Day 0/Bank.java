public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public int computeTotalEmployees() {
        int computeTotalEmployees = numberOfLoanOfficers + numberOfTellers;
        return computeTotalEmployees;
    }

    public String toString() {
        return ("This bank has " + numberOfLoanOfficers 
            + " loan officers and " + numberOfTellers + " tellers.");
    }

    public boolean equals(Bank other) {
        if (numberOfLoanOfficers == other.numberOfLoanOfficers 
            && numberOfTellers == other.numberOfTellers) {
            return true;
        } else {
            return false;
        }
    } 

    public void hireMembers(int numToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers = numToHire + numberOfLoanOfficers;
        } else {
            numberOfTellers = numToHire + numberOfTellers;
        }
    }


}