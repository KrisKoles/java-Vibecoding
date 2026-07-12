package ru.Homework12;

import ru.Homework12.exceptions.*;

import java.util.Arrays;


public class BaggageDropDesk {
    private String[] availableFlights;
    private static final int MAX_WEIGHT = 23;

    public BaggageDropDesk(String[] availableFlights) {
        this.availableFlights = availableFlights;
    }

    //сдача багажа
    public BaggageTicket baggageCheckIn(String passengersName, String flightNumber, int baggageWeight)
            throws FlightNotFoundException, OverweightBaggageException, BaggageTagPrintException{

        if(passengersName == null || passengersName.trim().isEmpty()){
            throw new InvalidPassengerNameException("Имя пассажира не может быть пустым.");
        }if(baggageWeight <= 0){
            throw new InvalidBaggageWeightException("Вес багажа меньше или равен нулю.");
        }if(!Arrays.asList(availableFlights).contains(flightNumber)){
            throw new FlightNotFoundException("Рейс " + flightNumber + " не найден.");
        }if(baggageWeight > MAX_WEIGHT){
            throw new OverweightBaggageException("Вес багажа " + baggageWeight + " кг превышает лимит " + MAX_WEIGHT + " кг.");
        }if("AE-404".equals(flightNumber)){
            throw new BaggageTagPrintException("Не удалось напечатать багажную бирку для рейса " + flightNumber + ".");
        }
        System.out.println("Багаж успешно зарегистрирован для " + passengersName + ". Необходимо оплатить налог за вредность");
        return new BaggageTicket(passengersName, flightNumber, baggageWeight);
    }
}
