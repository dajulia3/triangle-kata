package triangles;

import java.util.*;

public class TriangleClassifier {

    public int identifyTriangle(int a, int b, int c) {
        List<Integer> sides = sidesList(a, b, c);
        if (triangleIsImpossible(sides)) {
            throw new TriangleMalformedException();
        }

        return triangleClassificationId(sides);
    }

    private int triangleClassificationId(List<Integer> sides) {
        return new HashSet<>(sides).size();
    }

    private boolean triangleIsImpossible(List<Integer> sides) {
        Collections.sort(sides);
        return sides.get(0) + sides.get(1) <= sides.get(2);
    }

    private List<Integer> sidesList(int a, int b, int c) {
        List<Integer> sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
        sides.add(c);
        return sides;
    }

    public static class TriangleMalformedException extends RuntimeException {
    }
}
