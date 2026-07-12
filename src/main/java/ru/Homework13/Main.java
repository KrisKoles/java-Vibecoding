package ru.Homework13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alien> aliens = new ArrayList<>();
        aliens.add(new Alien("Зигмунд", "Марс", 3));
        aliens.add(new Alien("Громозека", "Венера", 9));
        aliens.add(new Alien("Кью-Кью", "Альфа Центавра", 5));
        aliens.add(new Alien("Зигмунд", "Марс", 8));
        aliens.add(new Alien("Омниус", "Сириус-Б", 2));
        aliens.add(new Alien("Зерг-Мастер", "Глизе-581", 10));
        aliens.add(new Alien("Громозека", "Венера", 9));
        aliens.add(new Alien("Трус Петя", "Альфа Центавра", 5));
        aliens.add(new Alien("Зигмунд", "Марс", 8));
        aliens.add(new Alien("Трус Вася", "Сириус-Б", 2));
        aliens.add(new Alien("Зерг-Мастер", "Глизе-581", 10));


        //Проверяем, содержит ли список дубликат
        System.out.println("Содержит дубликаты? " +
                (aliens.size() != new HashSet<>(aliens).size()));

        // Создаём экземпляр SquadManager
        SquadManager manager = new SquadManager();

        // Вызываем метод demonstrateListCreations()
        manager.demonstrateListCreations();

        // Вызываем фильтрацию по "Трус"
        manager.filterOutCowards(aliens);

        AssaultQueue queue = new AssaultQueue();

        //добавили 5 человек
        queue.addRecruit("Громозека");
        queue.addRecruit("Шредер");
        queue.addRecruit("Тор-Могул");
        queue.addRecruit("Кракен");
        queue.addRecruit("Брут");

        // Уходят 2
        System.out.println("Ушли: " + queue.retreatCoward() + ", " + queue.retreatCoward());

        // Добавляем 3 новых
        queue.addRecruit("Зигмунд");
        queue.addRecruit("Кью-Кью");
        queue.addRecruit("Омниус");

        // Итог
        queue.printQueue();


        // Создаём список пришельцев
        List<Alien> captured = List.of(
                new Alien("Зигмунд", "Марс", 3),
                new Alien("Громозека", "Венера", 9),
                new Alien("Кракен", "Нептун", 10)
        );

        // Создаём два отчёта с одинаковыми данными
        MissionReport report1 = new MissionReport("Штурм Зоны 51", new ArrayList<>(captured), 50);
        MissionReport report2 = new MissionReport("Штурм Зоны 51", new ArrayList<>(captured), 50);

        // Выводим отчёты
        System.out.println(report1);
        System.out.println(report2);

        // Сравниваем
        System.out.println("== : " + (report1 == report2));
        System.out.println("equals(): " + report1.equals(report2));
    }
}



