package geometry;

import geometrytests.SegmentTests;

public class TestSegment {
    public static void main(String[] args) {
        boolean ok = true;
        SegmentTests segmentTester = new SegmentTests();
        ok = ok && segmentTester.testLength();
        System.out.println(ok ? " All tests  OK " : " At least one test KO.");

    }
}
