package geometry;


public class Executable {
    public static void main(String [] args){
        Position p1=new Position(2, 3);
        System.out.println("Initial Position: \n");
        System.out.println(p1.getRepresentation());
        System.out.println("\nSymmetric Position: \n");
        p1.symmetricX();
        System.out.println(p1.getRepresentation());
    }
}
