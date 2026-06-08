package ru.Homework7.arena.heroes;

public class Hero {

    private String name;
    private int level;
    private int health;

    //Статическое поле для подсчета всех созданных героев
    private static int heroesCreated = 0;

    public static final int MAX_LEVEL = 100;

    //конструктор
    public Hero(String name, int level, int health){
        this.name = name;
        this.level = level;
        this.health = health;

        heroesCreated++;
        }

    //вывод данных о герое
    public void printInfo(){
            System.out.println("╔═════════════════════════════════════════╗");
            System.out.println("║          🦸‍♂️  ИНФОРМАЦИЯ О ГЕРОЕ  🦸‍♀️          ║");
            System.out.println("╠═════════════════════════════════════════╣");
            System.out.println("║ Имя:      " + name);
            System.out.println("║ Уровень:  " + level + " / " + MAX_LEVEL);
            System.out.println("║ Здоровье: " + health + " ❤️");
            System.out.println("╚═════════════════════════════════════════╝");
    }


    //уменьшает здоровье героя на переданное значение
    public void takeDamage(int damage) {
        health = health - damage;
        if (health < 0) {
            health = 0;
        }
    }
    public void levelUp(){
        if (level < MAX_LEVEL){
            level++;
            System.out.println("🌟 " + name + " повысил уровень до " + level + "!");
        }else{
                System.out.println("⚠️ " + name + " уже достиг максимального уровня " + MAX_LEVEL + "!");
    }
    }
        public void attack(){
            System.out.println("Герой наносит обычный удар");
        }

        public void attack(String target){
            System.out.println("Герой наносит обычный удар. Цель:" + target);
        }
        public void attack(String target, int times){
            System.out.println("Герой атакует цель" + target + times + "раз.");
    }
    // количество-созданных-объектов-героев
    public static void printHeroesCreated(){
        System.out.println("Всего создано героев:" + heroesCreated);
    }

    public final void rest(){
        System.out.println("Герой отдыхает и восстанавливает силы.");
    }

    //геттеры
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }
    public static int getHeroesCreated() {
        return heroesCreated;
    }
}

