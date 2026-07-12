package ru.Homework12;

import ru.Homework12.exceptions.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[] flights = {"SU-123", "TK-777", "KC-909", "AE-404"};
        BaggageDropDesk myBaggageDropDesk = new BaggageDropDesk(flights);
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Введите имя: ");
            String passengersName = scanner.nextLine();

            System.out.print("Введите номер рейса: ");
            String flightNumber = scanner.nextLine();

            int baggageWeight = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Введите вес багажа (кг): ");
                    baggageWeight = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("❌ Ошибка: введите целое число!");
                    scanner.nextLine(); // Очищаем буфер
                }
            }

            //Вызываем метод и получаем билет
            BaggageTicket ticket = myBaggageDropDesk.baggageCheckIn(passengersName, flightNumber, baggageWeight);

        }catch (InvalidPassengerNameException e) {
            System.out.println("Ошибка: имя пассажира не может быть пустым");

        }catch (InvalidBaggageWeightException e) {
            System.out.println("Ошибка: вес багажа не может быть 0 или отрицательным");

        }catch (FlightNotFoundException e) {
            System.out.println("Ошибка: указанного пассажиром рейса не существует в базе");
        }
        catch (BaggageTagPrintException e) {
            System.out.println("Ошибка: невозможно напечатать бирку");
        }
        catch (OverweightBaggageException e) {
            System.out.println("Ошибка: багаж слишком тяжелый");
        }
        finally {
            scanner.close();
        }
    }
}
