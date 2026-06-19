package ru.Homework10.TaskTracker;

public class Task {

    private String title;       //название задачи
    private boolean isCompleted; //статус задачи

    public Task(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    //Пометить задачу как выполненную
    public void markAsCompleted() {
        isCompleted = true;
    }

    //Получить статус (выполнена или нет)
    public boolean isCompleted() {
        return isCompleted;
    }
    //Получить название задачи
    public String getTitle() {
        return title;
    }
    //Вывести информацию о задаче
    public void printInfo() {
        if (isCompleted) {
            System.out.println("[x] " + title);
        } else {
            System.out.println("[ ] " + title);
        }
    }
    }
