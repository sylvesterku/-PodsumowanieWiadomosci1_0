package com.sda.repeating.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    public void isHypotanusEquals5(){
        double a = 5;
        double b = 3;
        double c = 4;
        Triangle triangle = new Triangle(a, b, c);

        assertEquals(5, triangle.hypotenuse());
    }

    @Test
    public void isAreaEquals6(){
        double a = 5;
        double b = 3;
        double c = 4;
        Triangle triangle = new Triangle(a, b, c);

        assertEquals(6, triangle.area());
    }

    @Test
    public void isPerimeterEquals12(){
        double a = 3;
        double b = 5;
        double c = 4;
        Triangle triangle = new Triangle(a, b, c);

        assertEquals(12, triangle.perimeter());
    }

}