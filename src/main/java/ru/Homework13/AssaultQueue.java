package ru.Homework13;

import java.util.LinkedList;

public class AssaultQueue {
    private LinkedList<String> queue;

    //создаём пустую очередь
    public AssaultQueue() {
        this.queue = new LinkedList<>();
    }

    //Добавление штурмовика в конец очереди
    public void addRecruit(String name){
        queue.addLast(name);  // добавляем в конец очереди
        System.out.println("Штурмовик \"" + name + "\" добавлен в очередь");
    }

    @Override
    public String toString() {
        return queue.toString();
    }

    //Удаляет и возвращает штурмовика из начала очереди
    public String retreatCoward(){
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста!");
            return null;
        }

        // Удаляем и возвращаем первого штурмовика
        String coward = queue.removeFirst();
        System.out.println("Штурмовик \"" + coward + "\" удалён из начала очереди");
        return coward;
    }
    //Текущее состояние очереди.
    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("Очередь: [пусто]");
        } else {
            System.out.println("Очередь: " + queue);
        }
        System.out.println("Количество штурмовиков: " + queue.size());
    }
}

