public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
    }

    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String toString() {
        String display = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            display = display + (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return display;
    }

    public String findBestStudent() {
        if (enrolledStudents.length == 0) {
            return null;
        }

        StudentRecord best = enrolledStudents[0];
        double bestAvg = best.getFinalAverage();

        for (int i = 1; i < enrolledStudents.length - 1; i++) {
            double currentAverage = enrolledStudents[i].getFinalAverage();
            if (currentAverage > bestAvg) {
                best = enrolledStudents[i];
                bestAvg = currentAverage;
            }
        }
        return best.getName();
    }

    public double calculateTestAverage(int testNumber) {
        double total = 0.0;
        int count = 0;

        for (int i = 0; i < enrolledStudents.length; i++) {
            int score = enrolledStudents[i].getTestScore(testNumber);
            if (score > 0) {
                total = total + score;
                count += 1;
            }
        }
        if (count == 0.0) {
            return 0.0;
        }

        return total / count;
    }

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                break;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                StudentRecord nextstudent = enrolledStudents[i];
                String nextStudentName = nextstudent.getName();
                if (student.getName().equals(nextStudentName)) {
                    enrolledStudents[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int counter = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        int largerClassSize = enrolledStudents.length + sizeIncrease;
        StudentRecord[] larger = new StudentRecord[largerClassSize];

        for (int i = 0; i < enrolledStudents.length; i++) {
            larger[i] = enrolledStudents[i];
        }
        enrolledStudents = larger;
    }

}
