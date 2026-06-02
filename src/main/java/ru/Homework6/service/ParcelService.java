package ru.Homework6.service;
import ru.Homework6.model.Parcel;

public class ParcelService {

    public void printParcelsReport(Parcel[] parcels) {
        for (int i = 0; i < parcels.length; i++) {
            Parcel parcel = parcels[i];
            parcel.printInfo();
            System.out.println("Стоимость доставки: " + parcel.calculateDeliveryPrice() + " руб.");
            System.out.println(); // пустая строка-разделитель
        }
    }
}