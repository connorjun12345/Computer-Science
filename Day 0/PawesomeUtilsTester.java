public class PawesomeUtilsTester {
    public static void main(String[] args) {
        System.out.println(PawesomeUtils.validateDogId(555));
        System.out.println(PawesomeUtils.validateDogId(99));
        System.out.println(PawesomeUtils.validateDogId(1000));

        Dog dogA = new Dog("Hannah", "Olivia", 5, 100);
        Dog dogB = new Dog("Bella", "Grace", 6, 540);
        Dog dogC = new Dog("Sophia", "Liv", 1, 657);
        System.out.println(PawesomeUtils.validateDogTag(dogA));
        System.out.println(PawesomeUtils.validateDogTag(dogB));
        System.out.println(PawesomeUtils.validateDogTag(dogC));

    }
}
