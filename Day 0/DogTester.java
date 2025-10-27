public class DogTester { 
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Max", "Connor", 5, 123);
        Dog dog3 = new Dog("Joe", "Bob", 4, 693);
        Dog dog4 = new Dog("Sam", "Greg", 3, 789);
        Dog dog5 = new Dog("John", "Maria", 1, 987);
        Dog dog6 = new Dog("Henry", "Lukas", 2, 654);

        System.out.println("Test Getters Dog1: " + dog1.getName() + " " + dog1.getOwnerName() + " " + dog1.getAge() 
            + " " + dog1.getDogId() + " " + dog1.getDogTag() + " " + dog1.getDogChar() + " " + dog1.isStillInFacility() );
        System.out.println("Test Getters Dog2: " + dog2.getName() + " " + dog2.getOwnerName() + " " + dog2.getAge() 
            + " " + dog2.getDogId() + " " + dog2.getDogTag() + " " + dog2.getDogChar() + " " + dog2.isStillInFacility() );
        System.out.println("Test Getters Dog3: " + dog3.getName() + " " + dog3.getOwnerName() + " " + dog3.getAge() 
            + " " + dog3.getDogId() + " " + dog3.getDogTag() + " " + dog3.getDogChar() + " " + dog3.isStillInFacility() );

        int dogId = 246;
        int age = 2;
        dog3.setDogId(dogId);
        dog3.setAge(age);
        dog3.setDogTag(dog3.generateDogTag());

        System.out.println(Dog.generateDogChar(dog1.getDogId()));
        System.out.println(Dog.generateDogChar(dog2.getDogId()));
        System.out.println(Dog.generateDogChar(dog3.getDogId()));

        System.out.println(dog1.generateDogTag());
        System.out.println(dog2.generateDogTag());
        System.out.println(dog3.generateDogTag());

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        System.out.println("Is dog 1 equal to dog 2?: " + dog1.equals(dog2));
        System.out.println("Is dog 1 equal to dog 3?: " + dog1.equals(dog3));

        System.out.println("HERE!!!");
        System.out.println(Dog.generateDogChar(123));
        System.out.println(Dog.generateDogChar(456));
        System.out.println(Dog.generateDogChar(789));

        System.out.println(Dog.pickup(dog5, "Maria"));
        System.out.println(dog5.isStillInFacility());
        System.out.println(Dog.pickup(dog5, "Bob"));
        System.out.println(dog5.isStillInFacility());

        dog6.setStillInFacility(false);
        Dog.checkIn(dog6, "Jim");
        System.out.println(dog6.isStillInFacility());
        System.out.println(dog6.getOwnerName());

        
    }
    
}