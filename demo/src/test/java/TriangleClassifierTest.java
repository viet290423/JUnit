import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.TriangleClassifier;

public class TriangleClassifierTest {
    
    @Test
    void testEquilateralTriangle() {
        assertEquals("Equilateral", TriangleClassifier.classifyTriangle(5, 5, 5));
    }
    
    @Test
    void testIsoscelesTriangle() {
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(5, 5, 3));
    }
    
    @Test
    void testScaleneTriangle() {
        assertEquals("Scalene", TriangleClassifier.classifyTriangle(3, 4, 5));
    }
    
    @Test
    void testNotATriangle() {
        assertEquals("NotATriangle", TriangleClassifier.classifyTriangle(1, 2, 10));
    }
}


