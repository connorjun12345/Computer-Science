public class HubTester {
    public static void main(String[] args) {
        testLoginStudent2();

    }

    public static void testLoginStudent() {
        try {
            Student s = new Student("@utrin", "Password!", "autrin@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because of @ in name, as intended");
        }
    }

    public static void testLoginStudent2() {
        try {
            Student student1 = new Student("Connor", "connorsPassword", "connor@gmail.com");
            Student s = new Student("Connor", "CJPassword!", "connor@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because duplicate student names, as intended");
        }
    }

    public static void testResetPassword() {
        try {
            Student s = new Student("", "123Password!", "name@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because name is blank, as intended");
        }
    }

    public static void testStudentBlankName() {
        try {
            Student s = new Student(" ", "Password!", "a@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because name is blank, as intended");
        }
    }

    public static void testStudentNullName() {
        try {
            new Student(null, "Password!", "a@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because student name null, as intended");
        }
    }

    public static void testStudentInvalidEmail() {
        try {
            new Student("Alex", "Password!", "invalidEmail");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because invalid email, as intended");
        }
    }

    public static void testStudentAtName() {
        try {
            new Student("@Alex", "Password!", "a@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because @ in name, as intended");
        }
    }

    public static void testStudentDuplicateName() {
        try {
            new Student("Bob", "Password!", "a@gmail.com");
            new Student("Bob", "Password2!", "ab@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because duplicate student name, as intended");
        }
    }

    public static void testChangeNameBlank() {
        try {
            Student s = new Student("Change", "passkey!", "c@gmail.com");
            s.changeName("");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because blank name when changing name, as intended");
        }
    }

    public static void testChangeNameAt() {
        try {
            Student s = new Student("ChangeName", "passkey!", "c@yahoo.com");
            s.changeName("@error");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because @ in name when changing name, as intended");
        }
    }

    public static void testChangeNameDuplicate() {
        try {
            Student x = new Student("X", "passkey!", "x@outlook.com");
            Student y = new Student("Y", "passkey!", "y@icloud.com");
            y.changeName("X");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because duplicate name when changing name, as intended");
        }
    }

    public static void testResetPasswordMissingName() {
        try {
            Student s = new Student("Name", "passkey!", "s@outlook.com");
            s.name = "";
            s.resetPassword();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because name missing, as intended");
        }
    }

    public static void testRegisterBlankName() {
        try {
            Hub h = new Hub();
            h.registerStudent("", "password!", "a@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because name is blank, as intended");
        }
    }

    public static void testRegisterBlankPassword() {
        try {
            Hub h = new Hub();
            h.registerStudent("Jared", "", "a@gmail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because password is blank , as intended");
        }
    }

    public static void testRegisterBlankEmail() {
        try {
            Hub h = new Hub();
            h.registerStudent("Conner", "password!", "");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because email is blank, as intended");
        }
    }

    public static void testRegisterInvalidEmail() {
        try {
            Hub h = new Hub();
            h.registerStudent("Henry", "password!", "invalidEmail");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because email is invalid, as intended");
        }
    }

    public static void testRegisterAtName() {
        try {
            Hub h = new Hub();
            h.registerStudent("@Henry", "password!", "henry@yahoo.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because @ in name, as intended");
        }
    }

    public static void testRegisterDuplicateName() {
        try {
            Hub h = new Hub();
            h.registerStudent("Jerry", "password!", "email2@email.com");
            h.registerStudent("Jerry", "Pass123", "email@email.com");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because duplicate names, as intended");
        }
    }

    public static void testLoginBlankUsername() {
        try {
            Hub h = new Hub();
            h.loginStudent(" ", "password");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because the username is blank, as intended");
        }
    }

    public static void testLoginBlankPassword() {
        try {
            Hub h = new Hub();
            h.loginStudent("Scott", "");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because the password is blank, as intended");
        }
    }

    public static void testLoginStudentNotfound() {
        try {
            Hub h = new Hub();
            h.loginStudent("Notfound", "password");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because the student was not found, as intended");
        }
    }

    public static void testLoginWrongPassword() {
        try {
            Hub h = new Hub();
            h.registerStudent("Mia", "correct", "mia@gmail.com");
            h.loginStudent("Mia", "wrong");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because password is wrong, as intended");
        }
    }

    public static void testDoesStudentExist1() {
        try {
            Hub h = new Hub();
            h.doesStudentExist("");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because blank display name, as intended");
        }
    }

    public static void testDoesStudentExist2() {
        try {
            Hub h = new Hub();
            h.registerStudent("Erika", "password!123", "erika@gmail.com");
            h.doesStudentExist("Erika");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception because student already exists, as intended");
        }
    }

}