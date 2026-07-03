package ru.Homework11;

public class NotEnoughWaterException extends RuntimeException{

    public NotEnoughWaterException(String message) {
        super(message); //Передаем сообщение в RuntimeException
    }
}
