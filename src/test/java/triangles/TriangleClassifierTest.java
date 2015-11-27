package triangles;

import org.junit.Test;
import triangles.TriangleClassifier;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class TriangleClassifierTest {

    @Test
    public void triangleType_returns1_whentriangleIsEquilateral() {
        TriangleClassifier classifier = new TriangleClassifier();
        int id = classifier.identifyTriangle(1, 1, 1);
        assertThat("equalateral triangle should return id of 1", id, equalTo(1));
    }

    @Test
    public void triangleType_returns2_whentriangleIsIsosceles() {
        TriangleClassifier classifier = new TriangleClassifier();
        int id = classifier.identifyTriangle(1, 1, 2);
        assertThat("isosceles triangle should return id of 2", id, equalTo(2));
    }

    @Test
    public void triangleType_returns3_whentriangleIsScalene() {
        TriangleClassifier classifier = new TriangleClassifier();
        int id = classifier.identifyTriangle(1, 2, 3);
        assertThat("scalene triangle should return id of 3", id, equalTo(3));
    }

    @Test
    public void triangleType_throwsException_whenTriangleSideIsZeroHeight() {
        TriangleClassifier classifier = new TriangleClassifier();
        try {
            classifier.identifyTriangle(0, 2, 3);
            fail();
        } catch (TriangleClassifier.TriangleMalformedException e) {
        }
    }

    @Test
    public void triangleType_throwsException_whenTriangleSideIsNegative(){
        TriangleClassifier classifier = new TriangleClassifier();
        try {
            classifier.identifyTriangle(-1, 2, 3);
            fail();
        } catch (TriangleClassifier.TriangleMalformedException e) {
        }
    }
}