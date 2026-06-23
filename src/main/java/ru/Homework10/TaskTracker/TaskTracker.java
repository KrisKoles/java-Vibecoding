package ru.Homework10.TaskTracker;

import java.util.ArrayList;
import java.util.List;

public class TaskTracker {

    // Список для хранения задач
    private List<Task> tasks;

    // Конструктор - создаем пустой список задач
    public TaskTracker() {
        this.tasks = new ArrayList<>();
    }

    //Добавить новую задачу в список
    public void addTask(String title) {
        Task newTask = new Task(title);
        tasks.add(newTask);
        System.out.println("Задача \"" + title + "\" добавлена!");
    }

    //Вывести все задачи
    public void printAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст!");
            return;
        }

        System.out.println("\n=== СПИСОК ЗАДАЧ ===");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.print((i + 1) + ". ");
            tasks.get(i).printInfo();
        }
    }

        //Найти задачу по названию
        public void findTaskByTitle(String title) {
            for (Task task : tasks) {
                if (task.getTitle().equalsIgnoreCase(title)) {
                    System.out.println("Задача найдена:");
                    task.printInfo();
                    return;
                }
            }
            System.out.println("Задача \"" + title + "\" не найдена!");
        }

         //Пометить задачу как выполненную (по названию)
        public void markTaskAsCompleted(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                if (task.isCompleted()) {
                    System.out.println("ℹЗадача \"" + title + "\" уже была выполнена!");
                    return;
                }
                task.markAsCompleted();
                System.out.println("Задача \"" + title + "\" отмечена как выполненная!");
                return;
            }
        }
        System.out.println("Задача \"" + title + "\" не найдена!");
    }

     //Вывести статистику по задачам
    public void printStatistics() {
        int total = tasks.size();
        int completed = 0;
        int open = 0;

        for (Task task : tasks) {
            if (task.isCompleted()) {
                completed++;
            } else {
                open++;
            }
        }
        System.out.println("\nСТАТИСТИКА ЗАДАЧ:");
        System.out.println("Всего задач: " + total);
        System.out.println("Выполнено:   " + completed);
        System.out.println("Открыто:     " + open);
    }
}
