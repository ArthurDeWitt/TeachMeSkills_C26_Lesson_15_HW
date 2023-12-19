package com.teachmeskills.lesson15.hw.homework1.runner;

import com.teachmeskills.lesson15.hw.homework1.circle.Circle;
import com.teachmeskills.lesson15.hw.homework1.figure.IFigure;
import com.teachmeskills.lesson15.hw.homework1.triangle.Triangle;

import java.awt.*;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        // Создаем коллекцию для хранения фигур
        ArrayList<IFigure> figures = new ArrayList<>();

        // Добавляем различные фигуры в коллекцию
        figures.add((IFigure) new Circle(5));
        figures.add((IFigure) new Rectangle(4, 6));
        figures.add((IFigure) new Triangle(3, 4, 5));

        // Проходим по коллекции и вызываем метод для подсчета и вывода периметра каждой фигуры
        for (IFigure figure : figures) {
            System.out.println("Perimeter: " + figure.calculatePerimeter());
        }
    }
}
