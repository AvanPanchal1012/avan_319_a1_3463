import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of triangles: ");
        int numTriangles = sc.nextInt();

        Triangle[] triangles = new Triangle[numTriangles];

        for(int i = 0; i<triangles.length ; i++){
            System.out.println("Triangle " + (i + 1));
            System.out.print("Enter x, y coordinates for point A: ");
            double xA = sc.nextDouble();
            double yA = sc.nextDouble();
            Point pointA = new Point(xA, yA);

            System.out.print("Enter x, y coordinates for point B: ");
            double xB = sc.nextDouble();
            double yB = sc.nextDouble();
            Point pointB = new Point(xB, yB);

            System.out.print("Enter x, y coordinates for point C: ");
            double xC = sc.nextDouble();
            double yC = sc.nextDouble();
            Point pointC = new Point(xC, yC);

            Triangle triangle = new Triangle(pointA, pointB, pointC);
            triangles[i] = triangle;
        }
        for (int i = 0; i < numTriangles; i++) {
            System.out.println("Triangle " + (i + 1) + " is " + triangles[i].getType() + " with perimeter " + triangles[i].calculatePerimeter());
        }

        System.out.print("Enter x, y coordinates for a point: ");
        double xP = sc.nextDouble();
        double yP = sc.nextDouble();
        Point pointP = new Point(xP, yP);

        for (int i = 0; i < numTriangles; i++) {
            if (triangles[i].isPointInside(pointP)) {
                System.out.println("Point is inside Triangle " + (i + 1));
            } else {
                System.out.println("Point is not inside Triangle " + (i + 1));
            }
        }
    }
}
