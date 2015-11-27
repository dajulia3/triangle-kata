package triangles;

import org.junit.Test;
import triangles.TriangleClassifier;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class TriangleClassifierTest {

    @Test
    public void identifyTriangle_returns1_whentriangleIsEquilateral() {
        TriangleClassifier classifier = new TriangleClassifier();
        int id = classifier.identifyTriangle(1, 1, 1);
        assertThat("equilateral triangle should return id of 1", id, equalTo(1));
    }

    @Test
    public void identifyTriangle_returns2_whentriangleIsIsosceles() {
        TriangleClassifier classifier = new TriangleClassifier();
        int id = classifier.identifyTriangle(1, 2, 2);
        assertThat("isosceles triangle should return id of 2", id, equalTo(2));
    }

    @Test
    public void identifyTriangle_returns3_whentriangleIsScalene() {
        TriangleClassifier classifier = new TriangleClassifier();
        int id = classifier.identifyTriangle(5, 4, 3);
        assertThat("scalene triangle should return id of 3", id, equalTo(3));
    }

    @Test
    public void identifyTriangle_throwsException_whenTriangleSideIsNegative(){
        TriangleClassifier classifier = new TriangleClassifier();
        try {
            classifier.identifyTriangle(-1, 2, 3);
            fail();
        } catch (TriangleClassifier.TriangleMalformedException e) {
        }
    }

    @Test
    public void identifyTriangle_throwsException_whenTriangleViolatesTriangleInequalityTheorem(){
        TriangleClassifier classifier = new TriangleClassifier();
        try {
            classifier.identifyTriangle(3, 2, 1);
            fail();
        } catch (TriangleClassifier.TriangleMalformedException e) {
        }

    }
}