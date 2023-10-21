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

    public boolean isPointInside(Point p) {
        return false;
    }
}
