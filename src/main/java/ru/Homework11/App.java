package ru.Homework11;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        CoffeeMachine myCoffeeMachine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);
        int amountWater = 0;

        try{
            System.out.print("Введите введите количество воды: ");
            amountWater = scanner.nextInt();

            myCoffeeMachine.makeCoffee(amountWater); //пытаемся приготовить кофе

            }catch (NotEnoughWaterException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
        }
    }

