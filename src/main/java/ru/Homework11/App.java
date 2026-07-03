package ru.Homework11;
import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        CoffeeMachine myCoffeeMachine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);
        int amountWater = 0;


        try {
            System.out.print("Введите количество воды (мл): ");
            amountWater = scanner.nextInt();

            System.out.print("Введите объем чашки (мл): ");
            int cupSize = scanner.nextInt();

            System.out.print("Введите название кофе: ");
            String coffeeName = scanner.next();

            //считаем количество чашек
            int cups = myCoffeeMachine.calculateCups(amountWater, cupSize);
            System.out.println("Из " + amountWater + " мл воды можно приготовить " +
                    cups + " чашек(ки) кофе по " + cupSize + " мл");

            //выводим название кофе null
            //String nullCoffeeName = null;  // Создаем null переменную
            // String nullResult = myCoffeeMachine.printCoffeeName(nullCoffeeName);
            //System.out.println("Результат: " + nullResult);

            //выводим название кофе в верхнем регистре
            myCoffeeMachine.printCoffeeName(coffeeName);

            myCoffeeMachine.makeCoffee(amountWater); //пытаемся приготовить кофе

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: нужно ввести число");

        } catch (NotEnoughWaterException e) {
            System.out.println("Ошибка: " + e.getMessage());

        }catch (ArithmeticException e) {
            System.out.println("Ошибка: размер чашки не может быть 0");

        }catch (NullPointerException e) {
            System.out.println(" Ошибка: название кофе отсутствует");

        } finally {
            scanner.close();
            System.out.println("Проверка кофемашины завершена");
        }

        }
    }

