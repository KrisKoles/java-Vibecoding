package ru.Homework12.exceptions;

//багаж слишком тяжелый
public class OverweightBaggageException extends AirportServiceException {
        public OverweightBaggageException(String message) {
            super(message);
        }

}
