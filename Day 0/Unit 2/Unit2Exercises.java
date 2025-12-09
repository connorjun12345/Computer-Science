public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        if (vacation == true) {
            if (day > 0 && day < 6) {
                return "10:00";
            } else {
                return "off";
            }
        } else {
            if (day > 0 && day < 6) {
                return "7:00";
            } else {
                return "10:00";
            }
        }
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }

        if (Math.abs(a - b) == 6 || Math.abs(b - a) == 6) {
            return true;
        }

        if (a + b == 6) {
            return true;
        }

        return false;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 & c == 2) {
            return 10;
        } else if (a == b & a == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String fizzString(String str) {
        String string = "";

        if (str.indexOf("f") == 0) {
            string = string + "Fizz";
        }
        if (str.length() > 0 && str.indexOf("b") == str.length() - 1) {
            string = string + "Buzz";
        }
        if (str.indexOf("f") != 0 && str.indexOf("b") != str.length() - 1) {
            string = string + str;
        }

        return string;

    }

    public static String doubleChar(String str) {
        String finish = "";
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            finish = finish + character + character;
        }

        return finish;

    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                dogCount++;
            }
        }

        int catCount = 0;
        for (int y = 0; y < str.length() - 2; y++) {
            if (str.charAt(y) == 'c' && str.charAt(y + 1) == 'a' && str.charAt(y + 2) == 't') {
                catCount++;
            }
        }

        if (catCount == dogCount) {
            return true;
        } else {
            return false;
        }

    }

    public static String mixString(String a, String b) {
        String mixedString = "";
        int maxLength = Math.max(a.length(), b.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) {
                mixedString += a.substring(i, i + 1);
            }
            if (i < b.length()) {
                mixedString += b.substring(i, i + 1);
            }
        }
        return mixedString;

    }

    public static String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);
        String repeatedString = "";
        for (int i = 0; i < n; i++) {
            repeatedString = repeatedString + end;
        }

        return repeatedString;
    }

    public static boolean endOther(String a, String b) {
        String one = a.toLowerCase();
        String two = b.toLowerCase();

        if (one.length() >= two.length()) {
            if (one.substring(one.length() - two.length()).equals(two)) {
                return true;
            }
        }

        if (two.length() >= one.length()) {
            if (two.substring((two.length() - one.length())).equals(one)) {
                return true;
            }
        }

        return false;
    }

    public static int countCode(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                counter++;
            }
        }

        return counter;
    }

    public static int countEvens(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int bigDiff(int[] nums) {
        int largest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        int smallest = nums[0];
        for (int y = 0; y < nums.length; y++) {
            if (nums[y] < smallest) {
                smallest = nums[y];
            }
        }

        return largest - smallest;
    }

    public static int sum13(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                total = total + nums[i];
            }
        }
        return total;
    }

    public static int[] fizzArray(int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = i;
        }

        return result;
    }

    public static boolean haveThree(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                counter++;
                if (i + 1 < nums.length && nums[i + 1] == 3) {
                    return false;
                }
            }
        }

        if (counter == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static String[] fizzArray2(int n) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = "" + i + "";
        }

        return result;
    }

    public static int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[index] = 0;
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[index] = nums[i];
                index++;
            }
        }

        return result;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                count++;
            }
        }

        String[] result = new String[count];

        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                result[index] = words[i];
                index++;
            }
        }

        return result;
    }

    public static int scoresAverage(int[] scores) {
        int mid = scores.length / 2;

        int firstHalf = average(scores, 0, mid);
        int secondHalf = average(scores, mid, scores.length);

        if (firstHalf > secondHalf) {
            return firstHalf;
        } else {
            return secondHalf;
        }

    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum = sum + scores[i];
        }

        return sum / (end - start);
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int largestA = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0) {
                if (a[i] > largestA) {
                    largestA = a[i];
                }
            }
        }

        int largestB = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 10 == 0) {
                if (b[i] > largestB) {
                    largestB = b[i];
                }
            }
        }

        return largestA + largestB;

    }

    public static String firstTwo(String str) {
        String string = "";
        if (str.length() == 1) {
            return "" + str + "*";
        } else if (str.length() == 0) {
            return "**";
        } else {
            String front = str.substring(0, 2);
            string = string + front + "";
        }
        return string;
    }

    public static double divide(int a, int b) {
        if (a == 0 || b == 0) {
            return 0.0;
        }
        if (a > b) {
            return (double) a / b;
        } else {
            return (double) b / a;
        }
    }
}
