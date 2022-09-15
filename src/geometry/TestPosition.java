package geometry;

import geometrytests.PositionTests;

public class TestPosition {
    public static void main(String[] args) {
        boolean ok = true;
        PositionTests positionTester = new PositionTests();
        ok = ok && positionTester.testGetX();
        ok = ok && positionTester.testGetY();
        ok = ok && positionTester.testSymmetricX();
        ok = ok && positionTester.testTranslate(); 
        System.out.println(ok ? " All tests  OK " : " At least one test KO.");
    }
}
