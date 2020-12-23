import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void checkEquilateralTriangle() {
        int side = 10;

        String result = TriangleClassifier.checkTriangle(side, side, side);
        String expected = "Equilateral triangle";
        assertEquals(expected, result);
    }

    @Test
    void checkIsoscelesTriangle(){
        int side1 = 10;
        int side2 = 10;
        int side3 = 5;

        String result = TriangleClassifier.checkTriangle(side1, side2, side3);
        String expected = "Isosceles triangle";
        assertEquals(expected, result);
    }

    @Test
    void isNotTriangle() {
        int side1 = 10;
        int side2 = 10;
        int side3 = 30;

        String result = TriangleClassifier.checkTriangle(side1, side2, side3);
        String expected = "Not triangle";
        assertEquals(expected, result);
    }

    @Test
    void isNormalTriangle() {
        int side1 = 10;
        int side2 = 11;
        int side3 = 12;

        String result = TriangleClassifier.checkTriangle(side1, side2, side3);
        String expected = "Normal triangle";
        assertEquals(expected, result);
    }
}