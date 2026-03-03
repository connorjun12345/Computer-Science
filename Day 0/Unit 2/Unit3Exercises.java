public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    // The original method did not check for null arrays or null elements, which
    // caused a NullPointerException and possible division by zero, so I added
    // checks to ignore null values and prevent dividing by zero.
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        if (strs == null) {
            return 0.0;
        }
        int nullCounter = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == null) {
                nullCounter++;
                continue;
            }
            sum += strs[i].length();
            // if (i % 2 == 0) {
            // sum = sum - 1;
            // }
        }
        if (strs.length == nullCounter) {
            return 0.0;
        }
        return sum / (strs.length - nullCounter);
    }

    // Intended: produce a new string with the characters of the input reversed.
    // The original method swapped characters incorrectly and did not handle null
    // input, so I fixed the swap logic and added a check that throws an exception
    // when the string is null.
    public static String reverseString(String str) {
        if (str == null) {
            throw new NullPointerException("str must not be null");
        }
        char[] chars = str.toCharArray(); // Abcde
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        // if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
        // chars[0] = Character.toLowerCase(chars[0]);
        // }
        return new String(chars);
    }

    // Intended: return the largest value found in the array.
    // The original method updated the max value incorrectly and changed the result
    // based on the index, so I simplified the logic to correctly track the largest
    // number and added a check for a null array.
    public static int findMaxValue(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("This array is null!");
        }
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;

    }

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    // The original method compared the wrong characters and returned random values
    // based on the index and string length, so I fixed the comparisons and made the
    // method return true only when the string is actually a palindrome.
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right);

            if (a != b) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Intended: sum only the even numbers in the array.
    // The original method added the wrong values, skipped elements, and changed the
    // sum incorrectly, so I fixed the loop and made it add only the even numbers in
    // the array.
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    // The first fix I did was start i at 0 instead of 1, then I threw an illegal
    // argument excepption if the array is null
    public static int calculateSumOfSquares(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("numbers array cannot be null");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    // I threw an exception if a negative number was provided. I also made it so
    // that it starts with 1.
    public static int getNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int a = 1, b = 1, c;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // I swapped when arr[j] > arr[i] and threw an illegal argument exception for
    // null arrays
    public static void sortArrayDescending(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("arr cannot be null");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // I added a check to check for null or empty strings and fixed the comparison
    // so that the method returns the first longest word
    public static String findLongestWord(String sentence) {

        if (sentence == null || sentence.equals(" ")) {
            throw new IllegalArgumentException("Sentence cannot be null or empty");
        }

        String[] words = sentence.split(" ");
        String longestWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    // I added checks for checking invalid inputs so the method throws an exception
    // when the principal or rate is negative or when the years is not positive
    public static double calculateInterest(double principal, double rate, int years) {

        if (principal < 0) {
            throw new IllegalArgumentException("Principal cannot be negative");
        }
        if (rate < 0) {
            throw new IllegalArgumentException("Rate cannot be negative");
        }
        if (years <= 0) {
            throw new IllegalArgumentException("Years cannot be negative");
        }

        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    // I made it so that if the parsed number is less than or equal to 0, it throws
    // a number format exception.
    public static int parsePositiveInteger(String str) {

        int number = Integer.parseInt(str);

        if (number <= 0) {
            throw new NumberFormatException("Number must be positive.");
        }

        return number;

    }

    public static String getArrayElement(String[] arr, int index) {

        return arr[index];

    }

    public static double calculateSquareRoot(int number) {

        return Math.sqrt(number);

    }

    public static int sumArrayElements(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }

    public static double calculatePower(double base, int exponent) {

        return Math.pow(base, exponent);
    }

}
