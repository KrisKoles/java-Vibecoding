package ru.Homework12.exceptions;

//имя пассажира null или пустое
public class InvalidPassengerNameException extends RuntimeException {
    public InvalidPassengerNameException(String message) {
        super(message);
    }
}
