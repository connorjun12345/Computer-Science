import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    public MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setSize(500, 500);
    }

    public void paint(Graphics g) {
        // to-do: draw the house!

        // Adds shapes to an ArrayList, converting them all to Polygons
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        // building
        shapes.add(new Rectangle(125, 125, 250, 250));
        shapes.get(0).setFillColor(Color.blue);

        // door
        shapes.add(new Rectangle(175, 250, 50, 125));
        shapes.get(1).setFillColor(Color.orange);

        // window
        shapes.add(new Square(285, 180, 50));

        // chimney
        shapes.add(new Square(140, 70, 50));

        // roof
        shapes.add(new Triangle(new int[] { 125, 250, 375 }, new int[] { 125, 75, 125 }));

        // sun
        shapes.add(new Circle(30, 30, 50));

        // bushes
        shapes.add(new Circle(360, 360, 40));
        shapes.get(6).setFillColor(Color.green);
        shapes.add(new Circle(300, 360, 40));
        shapes.get(7).setFillColor(Color.green);
        shapes.add(new Circle(327, 351, 50));
        shapes.get(8).setFillColor(Color.green);

        // Draws all the shapes in the ArrayList using that shape's draw method
        for (Shape p : shapes) {
            p.draw(g);
        }

    }

}
