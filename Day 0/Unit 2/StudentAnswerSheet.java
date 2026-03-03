import java.util.ArrayList;

public class StudentAnswerSheet {
    private String name;
    private double testScore;
    private ArrayList<String> answers;

    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (name == null || answers == null) {
            throw new IllegalArgumentException("Name and answers cant be null");
        }
        this.name = name;
        this.answers = answers;
        this.testScore = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public double getGrade(ArrayList<String> key) {

        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (answers == null) {
            throw new IllegalArgumentException("Answers cannot be null");
        }
        double score = 0.0;

        for (int i = 0; i < key.size(); i++) {
            if (answers.get(i).equals("?")) {
            } else if (key.get(i).equals(answers.get(i))) {
                score += 1;
            } else {
                score -= 0.25;
            }
        }

        return score;
    }

}