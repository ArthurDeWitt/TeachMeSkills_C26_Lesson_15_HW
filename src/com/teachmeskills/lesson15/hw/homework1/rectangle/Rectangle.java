package com.teachmeskills.lesson15.hw.homework1.rectangle;

import com.teachmeskills.lesson15.hw.homework1.figure.IFigure;

class Rectangle implements IFigure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
