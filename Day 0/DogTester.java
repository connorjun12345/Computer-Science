public class DogTester { 
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Max", "Connor", 5, 123);
        Dog dog3 = new Dog("Joe", "Bob", 4, 693);
        Dog dog4 = new Dog("Sam", "Greg", 3, 789);


        System.out.println("Test Getters Dog1: " + dog1.getName() + " " + dog1.getOwnerName() + " " + dog1.getAge() 
            + " " + dog1.getDogId() + " " + dog1.getDogTag() + " " + dog1.getDogChar() + " " + dog1.isStillInFacility());
        System.out.println("Test Getters Dog2: " + dog2.getName() + " " + dog2.getOwnerName() + " " + dog2.getAge() 
            + " " + dog2.getDogId() + " " + dog2.getDogTag() + " " + dog2.getDogChar() + " " + dog2.isStillInFacility());
        System.out.println("Test Getters Dog3: " + dog3.getName() + " " + dog3.getOwnerName() + " " + dog3.getAge() 
            + " " + dog3.getDogId() + " " + dog3.getDogTag() + " " + dog3.getDogChar() + " " + dog3.isStillInFacility());

        int dogId = 246;
        int age = 2;
        dog3.setDogId(dogId);
        dog3.setAge(age);
        dog3.setDogTag(PawesomeUtils.generateDogTag(dog3.getDogId(), dog3.getDogChar()));

        System.out.println(PawesomeUtils.generateDogChar(dog1.getDogId()));
        System.out.println(PawesomeUtils.generateDogChar(dog2.getDogId()));
        System.out.println(PawesomeUtils.generateDogChar(dog3.getDogId()));

        System.out.println(PawesomeUtils.generateDogTag(dog1.getDogId(), dog1.getDogChar()));
        System.out.println(PawesomeUtils.generateDogTag(dog2.getDogId(), dog2.getDogChar()));
        System.out.println(PawesomeUtils.generateDogTag(dog3.getDogId(), dog3.getDogChar()));

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        System.out.println("Is dog 1 equal to dog 2?: " + dog1.equals(dog2));
        System.out.println("Is dog 1 equal to dog 3?: " + dog1.equals(dog3));

        System.out.println("HERE!!!");
        System.out.println(PawesomeUtils.generateDogChar(123));
        System.out.println(PawesomeUtils.generateDogChar(456));
        System.out.println(PawesomeUtils.generateDogChar(789));

        Dog dog5 = new Dog("John", "Maria", 1, 987);

        System.out.println(PawesomeUtils.pickup(dog5, "Maria"));
        System.out.println(dog5.isStillInFacility());
        System.out.println(PawesomeUtils.pickup(dog5, "Bob"));
        System.out.println(dog5.isStillInFacility());

        Dog dog6 = new Dog("Henry", "Lukas", 2, 654);

        dog6.setStillInFacility(false);
        PawesomeUtils.checkIn(dog6, "Jim");
        System.out.println(dog6.isStillInFacility());
        System.out.println(dog6.getOwnerName());


        //1.3 stuff
        System.out.println(PawesomeUtils.validateDogId(555));
        System.out.println(PawesomeUtils.validateDogId(99));
        System.out.println(PawesomeUtils.validateDogId(1000));

        Dog dogA = new Dog("Hannah", "Olivia", 5, 100);
        Dog dogB = new Dog("Bella", "Grace", 6, 540);
        Dog dogC = new Dog("Sophia", "Liv", 1, 657);
        System.out.println(PawesomeUtils.validateDogTag(dogA));
        System.out.println(PawesomeUtils.validateDogTag(dogB));
        System.out.println(PawesomeUtils.validateDogTag(dogC));
        dogA.setDogTag("456G");
        System.out.println(PawesomeUtils.validateDogTag(dogA));
        System.out.println(PawesomeUtils.validateDogTag(dogB));
        System.out.println(PawesomeUtils.validateDogTag(dogC));

        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog1));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog2));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog3));
        System.out.println(PawesomeUtils.convertAgeToDogYear(49));
        System.out.println(PawesomeUtils.convertAgeToDogYear(7));
        System.out.println(PawesomeUtils.convertAgeToDogYear(100));
        System.out.println(PawesomeUtils.convertAgeToDogYear(70));
    }
    

}