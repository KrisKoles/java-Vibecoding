package ru.alfabank.Homework5;

import java.util.Random;

public class AlfaLab {

    //Протокол ГЕНЕРАТОР
    public String generateAccessCode() {
        int currentYear = java.time.Year.now().getValue();
        String year = String.valueOf(currentYear);
        int powerNumber = (int) Math.pow(3, 7);
        return year + "-" + powerNumber;
    }

    //Протокол ВАЛИДАТОР
    public boolean isValidCode(String code, int minLength) {
        if(code == null){
            return false;
        } else if(code.length() <= minLength){
            return false;
        } else if(!code.contains("-")){
            return false;
        }else return true;
    }
    //Протокол ЛОГГЕР
    public void logEvent(String message) {
        System.out.println("[INFO] " + message);
    }

    public void logEvent(String message, boolean isCritical) {
        if (isCritical) {
            System.out.println("[CRITICAL] " + message);
        } else {
            logEvent(message);  // переиспользуем версию 1
        }
    }

    //Протокол РАНДОМАЙЗЕР
    public String generateAgentId(String prefix, int seed){
    Random random = new Random(seed);

    int number = random.nextInt(9000) + 1000;

    // Возвращаем строку вида: ПРЕФИКС-ЧИСЛО
        return prefix + "-" + number;
    }

    public static void main(String[] args) {
        AlfaLab lab = new AlfaLab();
        // 1. Сгенерировать код доступа
        String accessCode = lab.generateAccessCode();

        // 2. Проверить его и вывести результат
        boolean isValid = lab.isValidCode(accessCode, 8);
        System.out.println("Сгенерированный код: " + accessCode);
        System.out.println("Результат проверки: " + isValid);
        System.out.println();

        // 3. Записать в лог событие "Server protection activated"
        lab.logEvent("Server protection activated");

        // 4. Записать критическое событие
        lab.logEvent("Intrusion attempt detected", true);
        System.out.println();

        // 5. Сгенерировать три ID агентов и вывести каждый
        System.out.println("=== ГЕНЕРАЦИЯ ID АГЕНТОВ ===");
        String agent1 = lab.generateAgentId("AGENT", 42);
        String agent2 = lab.generateAgentId("AGENT", 77);
        String agent3 = lab.generateAgentId("AGENT", 13);

        System.out.println("ID агента (seed=42): " + agent1);
        System.out.println("ID агента (seed=77): " + agent2);
        System.out.println("ID агента (seed=13): " + agent3);
    }
}
