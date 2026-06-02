package ru.Homework6.model;

public class FragileParcel extends Parcel {
    private boolean requiresCarefulHandling;

    // Конструктор с аргументами
    public FragileParcel(String recipientName, String deliveryAddress,
                         double weight, String trackingNumber, boolean requiresCarefulHandling) {
        super(recipientName, deliveryAddress, weight, trackingNumber);
        this.requiresCarefulHandling = requiresCarefulHandling;
    }

    // Переопределенный метод расчета стоимости (наценка 200)
    @Override
    public double calculateDeliveryPrice() {
        return super.calculateDeliveryPrice() + 200;
    }

    // Переопределенный метод вывода информации
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Handle with care: " + requiresCarefulHandling);
    }
}
