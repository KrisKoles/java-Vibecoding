package ru.Homework12.exceptions;

//вес багажа меньше или равен нулю
public class InvalidBaggageWeightException extends RuntimeException {
    public InvalidBaggageWeightException(String message) {
        super(message);
    }
}
