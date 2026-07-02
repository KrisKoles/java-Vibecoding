package ru.Homework11;

public class NotEnoughWaterException extends RuntimeException{

    public NotEnoughWaterException(String format) {
        super(format);
    }
}
