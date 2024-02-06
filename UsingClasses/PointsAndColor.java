import java.awt.Color;
import java.awt.Point;

/**
 * Demo classes used in MiniFig activity.
 * @author mvail
 */
public class PointsAndColor {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);

        System.out.println("My point: " + p1.toString());
        System.out.println("My point's x: " + p1.x);

        Color c1 = new Color(255, 45, 55);
        System.out.println("My color: " + c1.toString());
        
    }
}
