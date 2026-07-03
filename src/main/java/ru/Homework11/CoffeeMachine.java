package ru.Homework11;

public class CoffeeMachine {
    private static final int MIN_WATER_NEEDED = 200; // минимальное количество воды для кофе (мл)

    //приготоволение кофе
    public void makeCoffee(int waterAmount) {
        if (waterAmount <= MIN_WATER_NEEDED) {
            throw new NotEnoughWaterException(
                    String.format("Недостаточно воды для приготовления кофе. " +
                                    "Требуется: %d мл, доступно: %d мл. ",
                            MIN_WATER_NEEDED,
                            waterAmount)
            );
        }
        System.out.println("Кофе приготовлен!");

    }

    //сколько чашек можно приготовить
    public int calculateCups(int waterAmount, int cupSize) {
        return waterAmount/cupSize;
    }

    }

