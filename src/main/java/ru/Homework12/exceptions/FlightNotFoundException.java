package ru.Homework12.exceptions;

//указанного рейса нет в списке доступных рейсов
public class FlightNotFoundException extends AirportServiceException {
    public FlightNotFoundException(String message) {
        super(message);
    }
}