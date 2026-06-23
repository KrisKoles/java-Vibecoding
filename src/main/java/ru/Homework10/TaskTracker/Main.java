package ru.Homework10.TaskTracker;

public class Main {
    public static void main(String[] args){
        TaskTracker tracker = new TaskTracker();

        // Добавляем задачи
        tracker.addTask("Купить хлеб");
        tracker.addTask("Купить молоко");
        tracker.addTask("Поиграть");
        tracker.addTask("Поспать");

        // Выводим список
        tracker.printAllTasks();

        // Отмечаем задачу
        tracker.markTaskAsCompleted("Купить хлеб");

        // Снова выводим
        tracker.printAllTasks();

        // Статистика
        tracker.printStatistics();

        // Поиск
        tracker.findTaskByTitle("Купить хлеб");
    }
}
