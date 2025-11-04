public class CatTester {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Henry", "Leo", 1, "9876");
        Cat cat2 = new Cat("Bob", "Rob", 8, "5678");
        Cat cat3 = new Cat("Henry", "Leo", 1, "9876");

        cat2.setName("Joe");
        cat2.setOwnerName("Derek");
        cat2.setMoodLevel(9);
        cat2.setCatId("1234");
        
        PurrfectUtils.bootUp(cat1);
        PurrfectUtils.bootUp(cat2);
        // System.out.println(cat1.toString());
        // System.out.println(cat2.toString());
        System.out.println(cat1.equals(cat3));
        PurrfectUtils.pet(cat1);

        for (int i = 0; i < 4; i++) {
            PurrfectUtils.TrimClaws(cat1);
        }

        PurrfectUtils.cleanLitterBox(cat1);

        PurrfectUtils.feed(cat1);
    }
}
