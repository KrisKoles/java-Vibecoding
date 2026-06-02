package ru.Homework6.app;

import ru.Homework6.model.Parcel;
import ru.Homework6.model.FragileParcel;
import ru.Homework6.model.ExpressParcel;
import ru.Homework6.service.ParcelService;

public class Main {
    public static void main(String[] args) {

        // 1. Обычная посылка
        Parcel regularParcel = new Parcel("Иван Петров", "ул. Ленина, д.10", 2.5, "TRK123456");

        // 2. Хрупкая посылка
        FragileParcel fragileParcel = new FragileParcel("Мария Сидорова", "пр. Мира, д.5", 1.2, "FRG789012", true);

        // 3. Экспресс-посылка (доставка за 12 часов - быстрее 24)
        ExpressParcel expressParcel = new ExpressParcel("Алексей Иванов", "ул. Гагарина, д.15", 3.0, "EXP345678", 12);

        // 4. Посылка через конструктор без аргументов
        Parcel defaultParcel = new Parcel();

        // Создаем массив из 4 посылок
        Parcel[] parcels = {regularParcel, fragileParcel, expressParcel, defaultParcel};

        // Создаем сервис и выводим отчет
        ParcelService service = new ParcelService();
        service.printParcelsReport(parcels);
    }
}