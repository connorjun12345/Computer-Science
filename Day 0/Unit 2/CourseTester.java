public class CourseTester {
    public static void main(String[] args) {
        int[] connorScores = {95, 90, 93, 94};
        int[] sophieScores = {94, 88, 83, 99};
        int[] jessicaScores = {70, 80, 90, 100};

        StudentRecord connor = new StudentRecord("Connor", connorScores);
        StudentRecord sophie = new StudentRecord("Sophie", sophieScores);
        StudentRecord jessica = new StudentRecord("Jessica", jessicaScores);

        StudentRecord[] classList = {connor, sophie, jessica};

        Course cs = new Course("Computer Science", classList);

        System.out.println("Actual: " + connor.toString());
        System.out.println("Match: " + connor.toString()
            .equals("Connor's scores: [95, 90, 93, 94]"));

        System.out.println(connor.getAverage(0, 3) + "--> should be 93");

        System.out.println(connor.getTestScore(1) + "--> should be 90");

        System.out.println(cs.toString());

        System.out.println(cs.findBestStudent() + "--> should be Connor");

        System.out.println(cs.calculateTestAverage(1));
    }
}
