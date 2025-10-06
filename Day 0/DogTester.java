public class DogTester { 
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Max", "Connor", 5, 123);
        Dog dog3 = new Dog("Joe", "Bob", 4, 693);
        Dog dog4 = new Dog("Sam", "Greg", 3, 789);

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

        System.out.println(dog1.generateDogChar());
        System.out.println(dog2.generateDogChar());
        System.out.println(dog3.generateDogChar());

        System.out.println(dog1.generateDogTag());
        System.out.println(dog2.generateDogTag());
        System.out.println(dog3.generateDogTag());

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());

        System.out.println("Is dog 1 equal to dog 2?: " + dog1.equals(dog2));
        System.out.println("Is dog 1 equal to dog 3?: " + dog1.equals(dog3));
        
    }
    
}