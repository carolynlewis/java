import java.awt.Point;
import java.awt.Rectangle;

/**
 * Demonstrates use of Point and Rectangle classes.
 */
public class PointRect {

    public static void main(String[] args) {
        Point blank;
        blank = new Point(3, 4);

        int x = blank.x;
        System.out.println(blank.x + ", " + blank.y);
        int sum = blank.x * blank.x + blank.y * blank.y;

        // objects as parameters

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        double temp = distance(p1, p2);
        double dist = p1.distance(p2);  // dist is 5.0
        System.out.println(blank);

        // objects as return values

        Rectangle box = new Rectangle(0, 0, 100, 200);
        Point center = findCenter(box);

        // rectangles are mutable

        moveRect(box, 50, 100);  // now at (50, 100, 100, 200)
        System.out.println(box);

        box = new Rectangle(0, 0, 100, 200);
        box.translate(50, 100);

        // aliasing revisited

        Rectangle box1 = new Rectangle(0, 0, 100, 200);
        Rectangle box2 = box1;

        box1.grow(50, 50);
        System.out.println(box1);
        System.out.println(box2);
    }

    /**
     * Prints the attributes of a Point object.
     */
    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    /**
     * Computes the distance between two points.
     */
    public static double distance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Finds the center of a Rectangle and returns a new Point.
     */
    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    /**
     * Moves a Rectangle by modifying the x and y attributes.
     */
    public static void moveRect(Rectangle box, int dx, int dy) {
        box.x = box.x + dx;
        box.y = box.y + dy;
    }

    /**
     * Exercise on returning objects.
     */
    public static void exercise2() {
        Point blank = new Point(5, 8);

        Rectangle rect = new Rectangle(0, 2, 4, 4);
        Point center = findCenter(rect);

        double dist = distance(center, blank);
        System.out.println(dist);
    }

    /**
     * Exercise on aliasing.
     */
    public static void exercise3() {
        Rectangle box1 = new Rectangle(2, 4, 7, 9);
        Point p1 = findCenter(box1);
        printPoint(p1);

        box1.grow(1, 1);
        Point p2 = findCenter(box1);
        printPoint(p2);
    }

}
