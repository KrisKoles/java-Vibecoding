package ru.Homework13;

import java.util.Objects;

public class Alien {

    private final String name;
    private final String planet;
    private final int dangerLevel;

    //конструктор
    public Alien(String name,String planet, int dangerLevel){

        //валидация уровня опасности
        if (dangerLevel < 1 || dangerLevel > 10) {
            throw new IllegalArgumentException(
                    "dangerLevel должен быть от 1 до 10! Получено: " + dangerLevel
            );
        }
        this.name = name;
        this.planet = planet;
        this.dangerLevel = dangerLevel;
    }

    public String getName() {
        return name;
    }

    public String getPlanet() {
        return planet;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, planet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alien alien = (Alien) o;
        return Objects.equals(name, alien.name) &&
                Objects.equals(planet, alien.planet);
    }

    @Override
    public String toString() {
        return String.format(
                "Alien{name='%s', planet='%s', dangerLevel=%d}",
                name, planet, dangerLevel
        );
    }
}
