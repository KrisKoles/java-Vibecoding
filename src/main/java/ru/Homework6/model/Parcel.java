package ru.Homework6.model;

public class Parcel {
    // Поля с разными модификаторами доступа
    private String recipientName;      // private - доступ только внутри класса
    private String deliveryAddress;    // private - доступ только внутри класса
    protected double weight;           // protected - доступ в наследниках и в пакете
    private String trackingNumber;     // private - доступ только внутри класса

    // Конструктор с аргументами
    public Parcel(String recipientName, String deliveryAddress, double weight, String trackingNumber) {
        this.recipientName = recipientName;
        this.deliveryAddress = deliveryAddress;
        this.weight = weight;
        this.trackingNumber = trackingNumber;
    }

    // Конструктор без аргументов
    public Parcel() {
        this.recipientName = "Неизвестно";
        this.deliveryAddress = "Неизвестно";
        this.weight = 0.0;
        this.trackingNumber = "000000";
    }

    // Геттеры и сеттеры
    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Метод расчета стоимости доставки
    public double calculateDeliveryPrice() {
        return 100 + weight * 30;
    }

    // Метод вывода информации
    public void printInfo() {
        System.out.println("=== Информация о посылке ===");
        System.out.println("Получатель: " + recipientName);
        System.out.println("Адрес доставки: " + deliveryAddress);
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Трек-номер: " + trackingNumber);
    }
}
