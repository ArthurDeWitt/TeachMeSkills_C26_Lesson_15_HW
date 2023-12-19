package com.teachmeskills.lesson15.hw.homework0;
import java.util.ArrayList;
import java.util.Scanner;
/*
Создать коллекцию целых чисел и заполнить ее значениями, введенными с консоли.
При заполнении коллекции числами с консоли следует делать приведения типа.
Код для привдения строки к числу можно использовать следующий:
	int i = Integer.parseInt(str);
	или
	int val = Integer.valueOf(str);
Для окончания ввода введите слово "exit".
При приведении строки к числу, следует учитывать возможность исключений.
Некоторые полезные примеры кода для приведения строки к числу можно найти по ссылке
На экран вывести четные числа из коллекции.
 */

public class EvenNumbers {
    public static void main(String[] args) {
        // Создаем коллекцию для хранения целых чисел
        ArrayList<Integer> numbers = new ArrayList<>();
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (enter 'exit' to finish): ");

        // Читаем ввод пользователя и добавляем числа в коллекцию
        while (true) {
            String input = scanner.next();
            if (input.equals("exit")) {
                break;
            }

            try {
                // Преобразуем введенную строку в целое число и добавляем его в коллекцию
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                // Выводим сообщение об ошибке, если введенное значение не является целым числом
                System.out.println("Error: enter an integer or 'exit' to finish.");
            }
        }

        // Выводим четные числа из коллекции
        System.out.println("Even numbers from the collection: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
