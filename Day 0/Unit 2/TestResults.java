import java.util.ArrayList;

public class TestResults {
    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    public TestResults(ArrayList<String> answerKey, ArrayList<StudentAnswerSheet> submissions) {
        if (answerKey == null || submissions == null) {
            throw new IllegalArgumentException("AnswerKey and submissions cant be null");
        }
        this.answerKey = answerKey;
        this.submissions = submissions;
    }

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    public void submit(StudentAnswerSheet student) {
        submissions.add(student);
    }

    public void gradeTests() {
        for (int i = 0; i < submissions.size(); i++) {
            StudentAnswerSheet person = submissions.get(i);
            double grade = person.getGrade(answerKey);
            person.setTestScore(grade);
        }
    }

    public String highestScoringStudent() {
        if (submissions.size() == 0) {
            return "";
        }

        StudentAnswerSheet best = submissions.get(0);
        double bestScore = best.getGrade(answerKey);

        for (int i = 1; i < submissions.size(); i++) {
            StudentAnswerSheet person = submissions.get(i);
            double grade = person.getGrade(answerKey);
            if (grade > bestScore) {
                bestScore = grade;
                best = person;
            }

        }
        return best.getName();
    }

}