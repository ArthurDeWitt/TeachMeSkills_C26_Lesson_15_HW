package com.teachmeskills.lesson15.hw.homework1.triangle;

import com.teachmeskills.lesson15.hw.homework1.figure.IFigure;

public class Triangle implements IFigure {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
