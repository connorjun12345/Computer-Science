public class StudentTester {
    public static void main(String[] args) {
        //creating 4 students
        Student student1 = new Student("Connor", 9);
        Student student2 = new Student("James", 11);
        Student student3 = new Student("Jessica");
        Student student4 = new Student("Sophia");
        //displaying student info
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        //promoting each student 1 grade
        student1.setGrade(student1.getGrade() + 1);
        student2.setGrade(student2.getGrade() + 1);
        student3.setGrade(student3.getGrade() + 1);
        student4.setGrade(student4.getGrade() + 1);
        //verify students +1 grade
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        //checking if students are =
        student1.equals(student2);
        System.out.println(student1.equals(student1));
    }

}
