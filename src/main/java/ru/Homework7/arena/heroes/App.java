package ru.Homework7.arena.heroes;

public class App {

    public static void main(String[] args) {
        Hero[] heroes = {

                new Knight("Артур", 50, 200, 25),
                new Archer("Леголас", 45, 150, 30),
                new Mage("Гэндальф", 60, 120, 100)
        };

        // Цикл для вызова printInfo() у каждого героя
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Герой " + (i + 1) + ":");
            heroes[i].printInfo();
            System.out.println();
        }

        // Цикл для вызова attack() у каждого героя
        for (Hero hero : heroes) {
            hero.attack();
        }

        final Knight knight = new Knight("Артур", 50, 200, 25);

        // Выводим значения полей через toString()
        System.out.println("📋 ДО изменения:");
        System.out.println(knight);  // автоматически вызывается toString()
        System.out.println();

        // Изменяем одно из полей (броню)
        System.out.println("🛠️ Изменяем броню с 25 на 40");
        knight.setArmor(40);

        System.out.println("📋 ПОСЛЕ изменения:");
        System.out.println(knight);
    }
}
