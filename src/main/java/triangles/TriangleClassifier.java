package triangles;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TriangleClassifier {

    public static final int ISOSCELES_TRIANGLE_ID = 1;
    public static final int EQUILATERAL_TRIANGLE_ID = 2;
    public static final int SCALENE_TRIANGLE_ID = 3;

    public int identifyTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new TriangleMalformedException();
        }

        if (a == b && b == c) {
            return ISOSCELES_TRIANGLE_ID;
        } else if (a == b || a == c || b == c) {
            return EQUILATERAL_TRIANGLE_ID;
        }
        return SCALENE_TRIANGLE_ID;
    }

    public class TriangleMalformedException extends RuntimeException {
    }
}
