package com.geekbrains.lesson5.homeWork5;

public class TriangleSquareCalculation {
    public static double calculateTriangleSquare(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 | c <= 0) throw new Exception(); // Сторона не может быть меньше или равна нулю
        if (a + b <= c || a + c <= b || b + c <= a)
            throw new Exception(); // Треугольник существует тогда и только тогда, когда сумма любых двух его сторон больше третьей стороны
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
