package ru.Homework13;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alien> aliens = new ArrayList<>();
        aliens.add(new Alien("Зигмунд", "Марс", 3));
        aliens.add(new Alien("Громозека", "Венера", 9));
        aliens.add(new Alien("Кью-Кью", "Альфа Центавра", 5));
        aliens.add(new Alien("Зигмунд", "Марс", 8));
        aliens.add(new Alien("Омниус", "Сириус-Б", 2));
        aliens.add(new Alien("Зерг-Мастер", "Глизе-581", 10));

        //Проверяем, содержит ли список дубликат
        System.out.println("Содержит дубликаты? " +
                (aliens.size() != new HashSet<>(aliens).size()));

        // Создаём экземпляр SquadManager
        SquadManager manager = new SquadManager();

        // Вызываем метод demonstrateListCreations()
        manager.demonstrateListCreations();
    }
}

