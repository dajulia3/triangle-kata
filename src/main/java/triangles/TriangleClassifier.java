package triangles;

import javafx.collections.transformation.SortedList;

import java.util.*;

public class TriangleClassifier {

    public int identifyTriangle(int a, int b, int c) {
        List<Integer> sides = sortedSides(a, b, c);

        if (sides.get(0) + sides.get(1) <= sides.get(2)) {
            throw new TriangleMalformedException();
        }

        return new HashSet<>(sides).size();
    }

    private List<Integer> sortedSides(int a, int b, int c) {
        List<Integer> sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
        sides.add(c);
        Collections.sort(sides);
        return sides;
    }

    public class TriangleMalformedException extends RuntimeException {
    }
}
