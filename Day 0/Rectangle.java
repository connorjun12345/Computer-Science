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
    public Rectangle(int desiredLength, int desiredWidth){
        length = desiredLength;
        width = desiredWidth;
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
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getcalculateArea() {
        return calculateArea;
    }



    public int calculatePerimeter() {
        return perimeter = 2 * length + 2 * width;
    }

    public double calculateDiagonal() {
        double calculateDiagonal = Math.sqrt(length * width) + (length * width);
        return calculateDiagonal;
    }
}
