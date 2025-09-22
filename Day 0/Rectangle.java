public class Rectangle {
    private int length;
    private int width;
    private int area;
    private int perimeter;

    public Rectangle() {
        //initialize the private instance variables
        length = 10;
        width = 5;
    }

    //defines the instance variable with the local parameters
    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
    }

    public Rectangle(int squareSideLength) {
        length = squareSideLength;
        width = squareSideLength;
    }

    //getters lets you get the private instance variables from the class
    public int getLength() {
        return length;
    }
    
    public int getWidth() {
        return width;
    }

    //setters
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public int calculateArea() {
        int calculateArea = length * width;
        return calculateArea;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        int perimeter = (length * 2) + (width * 2);
        return perimeter;
    }

    public double getDiagonal() {
        double calculateDiagonal = Math.sqrt((length * length) + (width * width));
        return calculateDiagonal;
    }

    public boolean equals(Rectangle other) {
        if (this.length == other.length && this.width == other.width) {
            return true;
        } else {
            return false;
        }
    }
}
