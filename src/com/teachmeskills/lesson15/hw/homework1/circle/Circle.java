package com.teachmeskills.lesson15.hw.homework1.circle;

import com.teachmeskills.lesson15.hw.homework1.figure.IFigure;

public class Circle implements IFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
