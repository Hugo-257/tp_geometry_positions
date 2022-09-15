package geometry;

public class Executable {
    public static void main(String[] args) {
        /*
         * Position p1=new Position(2, 3);
         * System.out.println("Initial Position: \n");
         * System.out.println(p1.getRepresentation());
         * System.out.println("\nSymmetric Position: \n");
         * p1.symmetricX();
         * System.out.println(p1.getRepresentation());
         */
        Position x1 = new Position(3, 4);
        Position x2 = new Position(7, 7);
        Segment s1 = new Segment(x1, x2);
        System.out.println(s1.getRepresentation());
    }
}
