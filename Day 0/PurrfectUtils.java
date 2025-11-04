public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        int mood = cat.getMoodLevel();
        String name = cat.getName();
        if (mood > 7 && mood <= 10) { 
            return "Currently, " + name + " is a great mood.\nPetting is appreciated.";
        }
        else if (mood > 3 && mood <=7) {
            return "Currently, " + name + " is reminiscing of a past life.\nPetting is acceptable.";
        } else {
            return "Currently, " + name + " is plotting revengaence.\nPetting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            String digit = catId.substring(i, i + 1);
            int num = Integer.parseInt(digit);
            sum = sum + num;
        }
        char catChar = (char) (sum % 26 + 'A');
        return catChar;
    }


    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            int x = low;
            low = high;
            high = x;
        }
        int randomNumber = (int) (Math.random() * (high - low) + low);
        return randomNumber;
    }

    public static String validateCatId(String catId) {
        int catNum = Integer.parseInt(catId);
        if (catNum >= 1000 && catNum <= 9999) {
            return catId;
        } else {
            int x = generateRandomNumber(1000, 10000);
            String newCatId = String.valueOf(x);
            return newCatId;
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel >= 0 && moodLevel <= 10) {
            return moodLevel;
        } 
        else if (moodLevel < 0) {
            return 0;
        } else {
            return 10;
        } 
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        int mood = cat.getMoodLevel();
        boolean hunger = cat.isHungry();
        System.out.println("Attempting to pet...\nPetting Successful!");
        if (mood >= 2) {
            mood += 1;
            cat.setMoodLevel(mood);
        }
        else if (mood < 2 && hunger == true) {
            mood -= 1;
            cat.setMoodLevel(mood);
        } 
        else if (mood < 2 && hunger == false) {
            mood += 1;
            cat.setMoodLevel(mood);
        }
    }

    public static void TrimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        String name = cat.getName();
        int mood = cat.getMoodLevel();
        double randomNum = Math.random();
        if (randomNum < 0.5) {
            mood -= 1;
            cat.setMoodLevel(mood);
            System.out.println(name + " did not like that...");
        } else {
            mood -= 2;
            cat.setMoodLevel(mood);
            System.out.println(name + " really hated that...");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        int mood = cat.getMoodLevel();
        String name = cat.getName();
        mood += 1;
        cat.setMoodLevel(mood);
        cat.setHungry(true);
        System.out.println("Cleaning the litter box... \nDone!\n" + name + " appreciated that.");
    }

    public static void feed(Cat cat) {
        int mood = cat.getMoodLevel();
        String name = cat.getName();
        mood += 2;
        cat.setMoodLevel(mood);
        cat.setHungry(false);
        System.out.println("Filling up " + name 
            + "'s bowl...\nDone!\n" + name 
            + " is eating...\n" + name + " is full!");
    }

}
