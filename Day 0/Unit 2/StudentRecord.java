public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    // to-do: implement getters
    // to-do: implement getTestScore
    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // inherited methods
    // to-do: implement toString
    public String toString() {
        return name + "'s scores: " + scores;
    }

     public boolean equals(StudentRecord other) {
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != other.scores[i]) {
                return false;
            }
        }
        if (!this.name.equals(other.name)) {
            return false;
        }
        return true;

    }

    // methods

    /*
     * returns the average (arithmetic mean) of the values in scores
     * precondition: 0 <= first < last < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        int counter = 0;
        double total = 0.0;
        for (int i = first; i <= last; i++) {
            total = total + scores[i];
            counter += 1;
        }

        double finalAverage = total / counter;
        return finalAverage;
    }


    public int getTestScore(int testNumber) {
        int testScore = scores[testNumber];
        if (testNumber >= scores.length) {
            return -1;
        } else {
            return testScore;
        }
    }
    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {

        return true;
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        return 0.0;
    }

}