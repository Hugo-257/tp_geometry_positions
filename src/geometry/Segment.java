package geometry;

public class Segment {
    private Position x1;
    private Position x2;

    public Segment(Position x1, Position x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public String getRepresentation() {
        return String.format("X1(%s,%s) et X2(%s,%s)", x1.getX(), x1.getY(), x2.getX(), x2.getY());
    }

    public double length() {
        return Math.sqrt(Math.pow(x2.getX() - x1.getX(), 2) + Math.pow(x2.getY() - x1.getY(), 2));
    }

    // Accesseurs
    public Position getX2() {
        return x2;
    }

    public Position getX1() {
        return x1;
    }

    public void setX1(Position x1) {
        this.x1 = x1;
    }

    public void setX2(Position x2) {
        this.x2 = x2;
    }

}
