package ru.Homework6.model;

public class ExpressParcel extends Parcel {
    private int deliveryHours;

    // Конструктор с аргументами
    public ExpressParcel(String recipientName, String deliveryAddress,
                         double weight, String trackingNumber, int deliveryHours) {
        super(recipientName, deliveryAddress, weight, trackingNumber);
        this.deliveryHours = deliveryHours;
    }

    // Переопределенный метод расчета стоимости
    @Override
    public double calculateDeliveryPrice() {
        // Если доставка быстрее чем за 24 часа - наценка 500
        if (deliveryHours < 24) {
            return super.calculateDeliveryPrice() + 500;
        }
        return super.calculateDeliveryPrice();
    }

    // Переопределенный метод вывода информации
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Delivery deadline: " + deliveryHours + " часов");
    }
}
