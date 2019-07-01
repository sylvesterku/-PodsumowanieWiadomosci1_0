package com.sda.repeating.triangle;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
        sort();
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        sort();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private void sort() {
        double tempA = a;
        double tempB = b;
        double tempC = c;

        if (tempA > tempB & tempA > tempC) {
            c = tempA;
            a = tempB;
            b = tempC;
        } else if (tempB > tempA & tempB > tempC) {
            b = tempC;
            c = tempB;
        }
    }

    public double hypotenuse() {
        return c;
    }

    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        return (a * b) / 2;
    }
}
