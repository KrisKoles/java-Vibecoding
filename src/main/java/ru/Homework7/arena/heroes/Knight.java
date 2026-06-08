package ru.Homework7.arena.heroes;

public class Knight extends Hero {

  private int armor;

  public Knight(String name, int level, int health, int armor){
      super(name, level, health);
      this.armor = armor;
  }

    @Override
    public void attack(){
        System.out.println("Рыцарь бьёт мечом!");
    }

    //public final void rest(){
    //    System.out.println("Герой на чилле");
    //}
    @Override
    public String toString() {
        return "Рыцарь: " + getName() +
                " | Уровень: " + getLevel() +
                " | Здоровье: " + getHealth() +
                " | Броня: " + armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
