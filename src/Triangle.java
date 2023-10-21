public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a,Point b,Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculatePerimeter() {
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ca = c.distanceTo(a);
        return ab + bc + ca;
    }

    public String getType() {
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ca = c.distanceTo(a);

        if (ab == bc && bc == ca) {
            return "Equilateral";
        } else if (ab == bc || bc == ca || ca == ab) {
            return "Isosceles";
        } else {
            return "Unknown";
        }

    }

    public boolean isPointInside(Point pt) {
        double areaABC = calculateArea(a, b, c);
        double areaPBC = calculateArea(pt, b, c);
        double areaPCA = calculateArea(a, pt, c);
        double areaPAB = calculateArea(a, b, pt);

        if(areaPBC + areaPCA + areaPAB == areaABC) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateArea(Point p1,Point p2,Point p3){
        return 0.5 * Math.abs((p1.getX() * (p2.getY() - p3.getY()) +
                p2.getX() * (p3.getY() - p1.getY()) +
                p3.getX() * (p1.getY() - p2.getY())));
    }
}
