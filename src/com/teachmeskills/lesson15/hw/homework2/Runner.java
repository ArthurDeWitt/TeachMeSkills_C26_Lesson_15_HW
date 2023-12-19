package com.teachmeskills.lesson15.hw.homework2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the collection of integers:");

        int size = 0;
        boolean validInput = false;

        // Проверяем ввод размера коллекции на валидность
        while (!validInput) {
            try {
                size = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: enter an integer for the size of the collection.");
            }
        }

        // Заполняем коллекцию рандомными числами
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(100)); // Генерируем случайное число от 0 до 99
        }

        // Вычисляем среднее арифметическое всех элементов коллекции
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / size;

        System.out.println("The arithmetic mean of all items in the collection: " + average);
    }
}
