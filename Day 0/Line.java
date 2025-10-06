public class Line {
    private int a;
    private int b;
    private int c;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double calculateSlope() {
        double calculateSlope = -(double) a / (double) b;
        return calculateSlope;
    }
   
    public boolean isCoordinateOnLine(int x, int y) {
        if ((a * x) + (b * y) + c == 0) {
            return true;
        } else {
            return false; 
        }
    }
      
    public String toString() {
        return ("Equation:" + a + "x" + "+" + b + "y" + "=" + c);
    }

    public boolean equals(Line other) {
        if (a == other.a && b == other.b && c == other.c) {
            return true;
        } else {
            return false;
        }

    }

}
