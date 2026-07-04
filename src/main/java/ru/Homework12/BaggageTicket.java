package ru.Homework12;

public class BaggageTicket {
    private String passengersName;
    private String flightNumber;
    private int baggageWeight;

    public BaggageTicket(String passengersName, String flightNumber, int baggageWeight){
        this.passengersName = passengersName;
        this.flightNumber = flightNumber;
        this.baggageWeight = baggageWeight;
    }

    public String getPassengersName() {
        return passengersName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getBaggageWeight() {
        return baggageWeight;
    }

    @Override
    public String toString() {
        return "Имя пассажира: " + passengersName +
               ", Номер рейса: " + flightNumber +
               " ,Вес багажа:" + baggageWeight;
    }



}

