import java.util.*;

public class Class {
    ArrayList<ArrayList<String>> classes;

    public Class() {
        classes = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < 4; i++) {
            ArrayList<String> students = new ArrayList<String>();
            int howManyStudents = (int) (Math.random() * 10);
            for (int j = 0; j < howManyStudents; j++) {
                students.add("" + Math.random());
            }
            classes.add(students);
        }

    }

    public int evenClasses() {
        int counter = 0;
        for (int i = 0; i < classes.size(); i++) {
            if (classes.get(i).size() % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

}