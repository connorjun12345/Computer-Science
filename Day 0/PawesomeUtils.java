public class PawesomeUtils {
    public static char generateDogChar(int dogId) {
        int x = (dogId / 100) % 10;
        int y = (dogId / 10) % 10;
        int z = (dogId % 10);
        int sum = x + y + z;
        return (char) ('F' + (sum % 10));
    }

    public static String pickup(Dog dog, String personName) {
        String ownersName = dog.getOwnerName();
        String name = dog.getName();
        if (dog.isStillInFacility() && ownersName.equals(personName)) {
            dog.setStillInFacility(false);
            return (name + " Has been picked up by their owner  " + personName);
        } 
        if (! dog.isStillInFacility() && ownersName.equals(personName)) {
            return (name + " Has already been picked up by their owner " + personName);
        } else {
            return (name + " is not your dog. You may not pick them up!");
        }
    }

    public static void checkIn(Dog dog, String personName) {
        if (validateDogTag(dog)) {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
            System.out.println(dog.getName() + "has been successfully checked in by " + dog.getOwnerName());
        } else {
            dog.setStillInFacility(false);
            System.out.println(dog.getName() + " is a counterfeit dog and was denied entry.");
        }

        
    }

    public static String generateDogTag(int dogId, char dogChar) {
        String generateDogTag = "" + dogId + dogChar;
        return generateDogTag;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int) (Math.random() * 900) + 100;
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int x = validateDogId(dog.getDogId());
        char y = generateDogChar(x);
        String newDogTag = "" + x + y;
        if (newDogTag.equals(dog.getDogTag())) {
            return true;
        } else {
            return false;
        }
    }

    public static int convertAgeToHumanAge(Dog dog) {
        int dogAge = dog.getAge();
        if (dogAge == 1) {
            int humanAge = 15;
            return humanAge;
        } 
        if (dogAge == 2) {
            int humanAge = 24;
            return humanAge;
        } else {
            int humanAge = 24 + ((dogAge - 2) * 5);
            return humanAge;
        }
    }

    public static int convertAgeToDogYear(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } 
        if (humanYears >= 15 && humanYears <= 24) {
            return 2;
        } else {
            return 2 + ((humanYears - 24) / 5);
        }
    }
}