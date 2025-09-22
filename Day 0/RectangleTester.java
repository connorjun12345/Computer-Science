public class RectangleTester {
    public static void main(String[] args) {
        // declaration: type name
        //Instantiation/Initialization: = new type();
        Rectangle one = new Rectangle();
        Rectangle two = new Rectangle(5, 10);
        System.out.println(two.getDiagonal()); 
        System.out.println(one.equals(two));
        System.out.println("Testing setLength: at first, length is " + two.getLength());
        two.setLength(12);
        System.out.println("After the setter, length is " + two.getLength());
        System.out.println("The diagonal of the rectangle is " + one.getDiagonal());
        System.out.println("The area of the rectangle is " + two.getArea());
        System.out.println("The perimeter of the rectangle is " + two.getPerimeter());
        
    }
}
