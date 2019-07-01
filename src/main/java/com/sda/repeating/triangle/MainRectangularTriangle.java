package com.sda.repeating.triangle;

import java.util.Scanner;

public class MainRectangularTriangle {
    public static void main(String[] args) {
        System.out.println("Program podający parametry trójkąta prostokątnego.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość boku a:");
        double a = validateSide(scanner);
        System.out.println("Podaj długość boku b:");
        double b = validateSide(scanner);
        System.out.println("Podaj długość boku c:");
        double c = validateSide(scanner);

        Triangle triangle = new Triangle(a, b, c);
        if (isRectangular(triangle.getA(), triangle.getB(), triangle.getC())) {
            System.out.println("Przeciwprostokątna wynosi: " + triangle.hypotenuse());
            System.out.println("Obwód trójkąta wynosi: " + triangle.perimeter());
            System.out.println("Pole trójkąta wynosi: " + triangle.area());
        } else {
            System.out.println("To nie jest trójkąt prostokątny.");
        }
    }

    private static double validateSide(Scanner scanner) {
        String side = scanner.next();
        double sideLength = 0;
        boolean correct = true;
        while (correct) {
            while (isDigit(side)) {
                sideLength = Double.parseDouble(side);
                if (isPositive(sideLength)) {
                    correct = false;
                    break;
                }
                System.out.println("Podaj liczbę dodatnią:");
                side = scanner.next();
            }
            if (correct) {
                System.out.println("Podaj liczbę a nie wyraz:");
                side = scanner.next();
            }
        }
        return sideLength;
    }

    private static boolean isRectangular(double a, double b, double c) {
        double aB = a * a + b * b;
        double cC = c * c;
        if (aB == cC) {
            return true;
        }
        return false;
    }

    private static boolean isPositive(double side) {
        if (side > 0) {
            return true;
        }
        return false;
    }

    private static boolean isDigit(String side) {
        try {
            Double.parseDouble(side);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
