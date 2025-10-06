public class Student {
    private String name;
    private String id;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }
    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return (name + " is a " + grade + "th grader. Their id is " + id + ".");
    }

    public boolean equals(Student other) {
        if (this.name.equals(other.name) && this.grade == other.grade && this.id.equals(other.id)) {
            return true;
        } else {
            return false;
        }
    }

    public String generateId() {
        int digit1 = (int) (Math.random() * 8) + 1;
        int digit2 = (int) (Math.random() * 8) + 1;
        int digit3 = (int) (Math.random() * 8) + 1;
        int digit4 = (int) (Math.random() * 10);
        int digit5 = (int) (Math.random() * 10);
        int digit6 = (int) (Math.random() * 10);
        int digit7 = (int) (Math.random() * 10);
        return digit1 + "" + digit2 + "" +  digit3 + "-" 
            + digit4 + digit5 + digit6 + digit7;
    }
}

