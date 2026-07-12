package ru.Homework13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquadManager {
    public void demonstrateListCreations() {
        //основной отряд
        ArrayList<Alien> mainSquad = new ArrayList<>();
        mainSquad.add(new Alien("Громозека", "Венера", 9));
        mainSquad.add(new Alien("Тор-Могул", "Марс", 8));
        mainSquad.add(new Alien("Кракен", "Нептун", 10));
        mainSquad.add(new Alien("Брут", "Юпитер", 7));


        //отряд поддержки
        List<Alien> supportSquad = Arrays.asList(
                new Alien("Эльвира", "Венера", 2),
                new Alien("Профессор Х", "Альфа Центавра", 4),
                new Alien("Нимбус", "Сириус-Б", 1)
        );

        //элитный отряд
        List<Alien> eliteSquad = List.of(
                new Alien("Шредер", "Сатурн", 9),
                new Alien("Кью-Кью", "Альфа Центавра", 5)
        );

        //Тестируем ArrayList
        //добавляем
        try {
            mainSquad.add(new Alien("Штурмовик-новобранец", "Земля", 4));
            System.out.println(" Добавление: УСПЕШНО! Новый размер: " + mainSquad.size());
        } catch (Exception e) {
            System.out.println("Добавление: " + e.getClass().getSimpleName());
        }

        //удаляем
        try {
            Alien removed = mainSquad.remove(0);
            System.out.println("Удаление: УСПЕШНО! Удалён: " + removed.getName());
            System.out.println(" Новый размер: " + mainSquad.size());
        } catch (Exception e) {
            System.out.println(" Удаление: " + e.getClass().getSimpleName());
        }
        System.out.println();

        //Тестируем Arrays.asList
        //добавляем
        try {
            supportSquad.add(new Alien("Штурмовик-новобранец", "Земля", 4));
            System.out.println(" Добавление: УСПЕШНО! Новый размер: " + supportSquad.size());
        } catch (Exception e) {
            System.out.println("Добавление: " + e.getClass().getSimpleName());
        }

        //удаляем
        try {
            Alien removed = supportSquad.remove(0);
            System.out.println("Удаление: УСПЕШНО! Удалён: " + removed.getName());
            System.out.println(" Новый размер: " + supportSquad.size());
        } catch (Exception e) {
            System.out.println(" Удаление: " + e.getClass().getSimpleName());
        }
        System.out.println();


        //Тестируем List.of
        //добавляем
        try {
            eliteSquad.add(new Alien("Штурмовик-новобранец", "Земля", 4));
            System.out.println(" Добавление: УСПЕШНО! Новый размер: " + eliteSquad.size());
        } catch (Exception e) {
            System.out.println("Добавление: " + e.getClass().getSimpleName());
        }

        //удаляем
        try {
            Alien removed = eliteSquad.remove(0);
            System.out.println("Удаление: УСПЕШНО! Удалён: " + removed.getName());
            System.out.println(" Новый размер: " + eliteSquad.size());
        } catch (Exception e) {
            System.out.println(" Удаление: " + e.getClass().getSimpleName());
        }
        System.out.println();

    }



}


