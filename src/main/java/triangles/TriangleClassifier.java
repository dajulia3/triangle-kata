package triangles;

import javafx.collections.transformation.SortedList;

import java.util.*;

public class TriangleClassifier {

    public int identifyTriangle(int a, int b, int c) {
        SortedSet<Integer> sides = sortedSides(a, b, c);

        if (sides.first() <= 0 ) {
            throw new TriangleMalformedException();
        }

        return sides.size();
    }

    private SortedSet<Integer> sortedSides(int a, int b, int c) {
        SortedSet<Integer> sides = new TreeSet<>();
        sides.add(a);
        sides.add(b);
        sides.add(c);
        return sides;
    }

    public class TriangleMalformedException extends RuntimeException {
    }
}
