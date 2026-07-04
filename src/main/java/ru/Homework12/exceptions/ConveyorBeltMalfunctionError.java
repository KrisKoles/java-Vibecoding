package ru.Homework12.exceptions;

//критическая ситуация, блокирующая работу пункта приема багажа.
public class ConveyorBeltMalfunctionError extends Error{
    public ConveyorBeltMalfunctionError(String message) {
        super(message);
    }
}
