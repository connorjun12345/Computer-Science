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

    public String toString() {
        return(name + " is a " + grade + "th grader. Their id is" + id + ".");
    }

    public boolean equals(Student other) {
        if (this.Student == other.Student) {
            return true;
        }
        else {
            return false;
        }
    }

    public String generateId() {
        
    }
}

