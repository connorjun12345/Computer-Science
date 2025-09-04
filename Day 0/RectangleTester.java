public class RectangleTester {
    public static void main(String[] args) {
        // declaration: type name
        //Instantiation/Initialization: = new type();
        Rectangle one = new Rectangle();
        Rectangle two = new Rectangle();
        Rectangle three = new Rectangle();
        Rectangle four = new Rectangle(6, 7);
        Rectangle five = new Rectangle(4, 10);
        Rectangle six = new Rectangle(8);

        System.out.println("Testing setLength: at first, length is " + five.getLength());
        five.setLength(12);
        System.out.println("After the setter, length is " + five.getLength());
        System.out.println("The area of the rectangle is " + caclulateArea);
    }
}
