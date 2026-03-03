public class Unit3ExercisesTester {

    public static void main(String[] args) {
        // testCalculateStringLengthAverage();
        // testCalculateStringLengthAverage2();
        // testCalculateStringLengthAverage3();
        // testReverseString1();
        // testReverseString2();
        // testReverseString3();
        // testReverseString4();
        // testFindMax();
        // testFindMax2();
        // testFindMax3();
        // testFindMax4();
        // testPalindrome();
        // testPalindrome2();
        // testPalindrome3();
        // testPalindrome4();
        // testSumEven();
        // testSumEven2();
        // testSumEven3();
        // testSumEven4();
        // calculateSumOfSquares();
        // calculateSumOfSquares2();
        // fibonacci();
        // fibonacci2();
        // descend();
        // descend2();
        // descend3();
        // longestWord();
        // longestWord2();
        // longestWord3();
        // testInterest1();
        // testInterest2();
        // testInterest3();
        // testInterest4();
        // testInterest5();
        // parse1();
        // parse1();
        // parse1();
        // getElement();
        // getElement2();
        sqrt();
        sqrt2();
        sum();
        sum2();
        power();
        power2();
    }

    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
    }

    public static void testCalculateStringLengthAverage2() {
        // Test Case - Edge Case: Null element rray
        String[] letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
    }

    public static void testCalculateStringLengthAverage3() {
        // Test Case - Edge CAse: Null array
        try {
            String[] letters = null;
            // expected output: 0
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null");
        }
    }

    public static void testReverseString1() {
        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
    }

    public static void testReverseString2() {
        // Test Case - Edge Case: String with spaces at the end and in the middle
        String testString = " ab c ";
        System.out.println("Expected ' c ba ': " + "'" + Unit3Exercises.reverseString(testString) + "'");
    }

    public static void testReverseString3() {
        // Test Case - Edge Case: String with special characters
        String testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + "'" + Unit3Exercises.reverseString(testString) + "'");
    }

    public static void testReverseString4() {
        // Test Case - Edge Case: Null string
        try {
            String testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null");
        }
    }

    public static void testFindMax() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("Expected 5: " + Unit3Exercises.findMaxValue(numbers));
    }

    public static void testFindMax2() {
        int[] numbers = { 0, 2, -45, -1, 83 };
        System.out.println("Expected 83: " + Unit3Exercises.findMaxValue(numbers));
    }

    public static void testFindMax3() {
        int[] numbers = { -1, -2, -45, -8, -83 };
        System.out.println("Expected -1: " + Unit3Exercises.findMaxValue(numbers));
    }

    public static void testFindMax4() {
        int[] nullArray = null;
        System.out.println("Expected 'null': " + Unit3Exercises.findMaxValue(nullArray));
    }

    public static void testPalindrome() {
        String word = "deed";
        System.out.println("Expected True: " + Unit3Exercises.isPalindrome(word));
    }

    public static void testPalindrome2() {
        String word = "Connor";
        System.out.println("Expected False: " + Unit3Exercises.isPalindrome(word));
    }

    public static void testPalindrome3() {
        String word = null;
        System.out.println("Expected False: " + Unit3Exercises.isPalindrome(word));
    }

    public static void testPalindrome4() {
        String word = "";
        System.out.println("Expected True: " + Unit3Exercises.isPalindrome(word));
    }

    public static void testSumEven() {
        int[] numbersArray = { 1, 2, 3, 4, 5 };
        System.out.println("Expected 6: " + Unit3Exercises.sumEvenNumbers(numbersArray));
    }

    public static void testSumEven2() {
        int[] numbersArray = { -1, -2, -3, -4, -5 };
        System.out.println("Expected -6: " + Unit3Exercises.sumEvenNumbers(numbersArray));
    }

    public static void testSumEven3() {
        int[] numbersArray = { -1, 2, -45, 88, 63 };
        System.out.println("Expected 90: " + Unit3Exercises.sumEvenNumbers(numbersArray));
    }

    public static void testSumEven4() {
        int[] numbersArray = null;
        System.out.println("Expected 0: " + Unit3Exercises.sumEvenNumbers(numbersArray));
    }

    public static void calculateSumOfSquares() {
        int[] numbersArray = { 1, 2, 3, 4, 5 };
        System.out.println("Expected 55: " + Unit3Exercises.calculateSumOfSquares(numbersArray));
    }

    public static void calculateSumOfSquares2() {
        int[] numbersArray = null;
        System.out.println("Expected 0: " + Unit3Exercises.calculateSumOfSquares(numbersArray));
    }

    public static void fibonacci() {
        int n = 5;
        System.out.println("Expected 5: " + Unit3Exercises.getNthFibonacci(n));
    }

    public static void fibonacci2() {
        int n = -5;
        System.out.println("Expected 0: " + Unit3Exercises.getNthFibonacci(n));
    }

    public static void descend() {
        int[] numbersArray = { 1, 3, 4, 2, 5 };
        Unit3Exercises.sortArrayDescending(numbersArray);
        System.out.println("Expected 5, 4, 3, 2, 1: ");

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i]);
            if (i < numbersArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void descend2() {
        int[] numbersArray = { 1, -3, 4, -2, -5 };
        Unit3Exercises.sortArrayDescending(numbersArray);
        System.out.println("Expected 4, 1, -2, -3, -5: ");

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i]);
            if (i < numbersArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void descend3() {
        try {
            int[] numbersArray = null;
            Unit3Exercises.sortArrayDescending(numbersArray);
            System.out.println("Expected exception");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null");
        }
    }

    public static void longestWord() {
        String sentance = "This was a very long assignment";
        System.out.println("Expected assignemnt: " + Unit3Exercises.findLongestWord(sentance));
    }

    public static void longestWord2() {
        String sentance = "This is long word";
        System.out.println("Expected this: " + Unit3Exercises.findLongestWord(sentance));
    }

    public static void longestWord3() {
        try {
            String sentance = null;
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(sentance));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the sentance was null");
        }
    }

    public static void testInterest1() {
        System.out.println("Expected 121.0: " + Unit3Exercises.calculateInterest(100, 10, 2));
    }

    public static void testInterest2() {
        System.out.println("Expected 210.0: " + Unit3Exercises.calculateInterest(200, 5, 1));
    }

    public static void testInterest3() {
        System.out.println("Expected 121.0: " + Unit3Exercises.calculateInterest(-100, 5, 2));
    }

    public static void testInterest4() {
        System.out.println("Expected 121.0: " + Unit3Exercises.calculateInterest(100, -5, 2));
    }

    public static void testInterest5() {
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(100, 5, 0));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exxception for invalid years");
        }
    }

    public static void parse1() {
        String str = "12";
        System.out.println("Expected 12: " + Unit3Exercises.parsePositiveInteger(str));
    }

    public static void parse2() {
        String str = "3";
        System.out.println("Expected 3: " + Unit3Exercises.parsePositiveInteger(str));
    }

    public static void parse3() {

        try {
            String str = "-5";
            System.out.println("Expected exception: " + Unit3Exercises.parsePositiveInteger(str));
        } catch (NumberFormatException e) {
            System.out.println("The method threw a number format exception for a negative number");
        }

    }

    public static void getElement() {
        String[] arr = { "a", "b", "c", "d", "e" };
        System.out.println("Expected c: " + Unit3Exercises.getArrayElement(arr, 2));

    }

    public static void getElement2() {
        try {
            String[] arr = { "a", "b", "c", "d", "e" };
            System.out.println("Expected exception: " + Unit3Exercises.getArrayElement(arr, 10));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The method threw an exception for an out of bounds index");
        }

    }

    public static void sqrt() {
        int number = 25;
        System.out.println("Expected 5.0: " + Unit3Exercises.calculateSquareRoot(number));
    }

    public static void sqrt2() {
        try {
            int number = -9;
            if (number < 0) {
                throw new IllegalArgumentException("Cannot  calculate square root of a negative number");
            }
            System.out.println("Expected Double.NaN: " + Unit3Exercises.calculateSquareRoot(number));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

    }

    public static void sum() {
        int[] array = { 1, 2, 3, 4, 5, };
        System.out.println("Expected 10: " + Unit3Exercises.sumArrayElements(array));

    }

    public static void sum2() {
        try {
            int[] array = null;
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println("Expected 0: " + sum);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The array was null, so the sum is 0");
        }

    }

    public static void power() {
        double base = 2;
        int exponent = 3;
        System.out.println("Expected 8.0: " + Unit3Exercises.calculatePower(base, exponent));
    }

    public static void power2() {
        try {
            double base = 2;
            int exponent = -2;

            if (exponent < 0) {
                throw new IllegalArgumentException("Exponent cannot be negative. Return 1");
            }

            System.out.println("Expected 1: " + Unit3Exercises.calculatePower(base, exponent));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("The tester threw an illegal argument exception for a negative exponent");
            System.out.println("Expected 1: 1");
        }

    }

}
