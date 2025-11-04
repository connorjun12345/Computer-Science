public class Line {
    private int a;
    private int b;
    private int c;
    private Point p1;
    private Point p2;
    

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        // instance variables a, b, and c
        // a = - (y2 - y1)
        this.a = -(p2.getY() - p1.getY()); 

        // b = x2 - x1
        this.b = p2.getX() - p1.getX(); 

        // c = - (a * x1 + b * y1)
        this.c = -(this.a * p1.getX() + p1.getY() * this.b); 
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }   

    public Point getP2() {
        return p2;
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

    public boolean isCoordinateOnLine(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isCoordinateOnLine'");
    }
   
    public boolean isCoordinateOnLine(Point p) {
        int x = p.getX();
        int y = p.getY();

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

    public double calculateSlopeFromPoints() {
        int diffX = p2.getY() - p1.getY();
        int diffY = p2.getX() - p1.getX();
        return (double) (diffY) / (double) (diffX);
    }

    public String generatePointSlopeFormula() {
        double m = calculateSlopeFromPoints();
        int x1 = p1.getX();
        int y1 = p1.getY();

        return "(y - " + y1 + ") = "  + m + "(x - " + x1 + ")";
    }



}
