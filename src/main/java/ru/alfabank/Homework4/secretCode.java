package ru.alfabank.Homework4;

import java.util.Scanner;

public class secretCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Массив для хранения 5 частей сообщения
        String[] messageParts = new String[5];

        System.out.println("=== РАСШИФРОВКА ДРЕВНЕГО ПОСЛАНИЯ ===\n");

        // Ввод 5 частей сообщения
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите часть " + (i + 1) + ": ");
            String input = scanner.nextLine();

            // Проверка на "NULL" (без учёта регистра)
            if (input.equalsIgnoreCase("NULL")) {
                System.out.println("Часть сообщения повреждена! Используем резервный фрагмент...");
                messageParts[i] = "XX";
            } else {
                messageParts[i] = input;
            }
        }
        // Сборка сообщения с разделителем "#"
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            result.append(messageParts[i]);
            if (i < 4) {  // Добавляем разделитель после каждой части, кроме последней
                result.append("#");
            }
        }

        // Вывод результата
        System.out.println("\n=== РЕЗУЛЬТАТ РАСШИФРОВКИ ===");
        System.out.println("Расшифрованное послание: " + result.toString());

        scanner.close();
    }
}
