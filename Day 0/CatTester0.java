public class CatTester0 {
    public static void main(String[] args) {
        Cat0 myCat = new Cat0("Betsy", "Tabby"); //added new
        Cat0 otherCat = new Cat0("Tiger Beast", "Tabby");//added new
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); //added print

        System.out.println("Are the cat's equal?" + myCat.equals(otherCat)); // added print

        System.out.println("Is my cat hungry? " + myCat.getIsHungry()); //changed print 

        String firstName = "Tiger";
        String lastName = "Beast"; //changed == to =
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}