import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        // to-do: implement the method
        for (int i = 0; i <= n; i++) {
            if (nums[i] != nums[nums.length - (n - i)]) {
                return false;
            }
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        for (int i = 0; i + 2 < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            }
            if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) {
                return true;
            }

        }
        // to-do: implement the method
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int[] numbers = new int[end - start];

        for (int i = start; i < end; i++) {
            numbers[i - start] = i;
        }
        // to-do: implement the method
        return numbers;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        String[] answer = new String[end - start];
        for (int i = 0; i < end - start; i++) {
            answer[i] = String.valueOf(start + i);
            if (Integer.parseInt(answer[i]) % 5 == 0 && Integer.parseInt(answer[i]) % 3 == 0) {
                answer[i] = "FizzBuzz";
            } else if (Integer.parseInt(answer[i]) % 3 == 0) {
                answer[i] = "Fizz";
            } else {
                answer[i] = "Buzz";
            }
        }
        // to-do: implement the method
        return answer;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCounter++;
            }
        }

        int evenIndex = 0;
        int oddIndex = evenCounter;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[evenIndex] = nums[i];
                evenIndex++;
            } else {
                result[oddIndex] = nums[i];
                oddIndex++;
            }
        }
        // to-do: implement the method
        return result;
    }

    public static ArrayList<Integer> square56(ArrayList<Integer> nums) {
        if (nums == null) {
            throw new IllegalArgumentException("List cannot be null!");
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int n : nums) {
            int value = n * n + 10;
            int last = value % 10;

            if (last != 5 || last != 6) {
                result.add(value);
            }
        }

        return result;
    }

    public static ArrayList<String> noYY(ArrayList<String> strings) {
        if (strings == null) {
            throw new IllegalArgumentException("List cannot be null!");
        }

        ArrayList<String> result = new ArrayList<>();

        for (String s : strings) {
            if (!(s + "y").contains("yy")) {
                result.add(s);
            }
        }
        return result;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}
