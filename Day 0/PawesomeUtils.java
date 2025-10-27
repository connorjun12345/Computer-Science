public class PawesomeUtils {
    public static char generateDogChar(int dogId) {
        int x = (dogId / 100) % 10;
        int y = (dogId / 10 ) % 10;
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
        if (! dog.isStillInFacility() && ownersName.equals(personName)){
            return (name + " Has already been picked up by their owner " + personName);
        }
        else {
            return (name + " is not your dog. You may not pick them up!");
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.setStillInFacility(true);
        dog.setOwnerName(personName);
    }

    public static String generateDogTag(int dogId, char dogChar) {
        String generateDogTag = "" + dogId + dogChar;
        return generateDogTag;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int)(Math.random() * 900) + 100;
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
}