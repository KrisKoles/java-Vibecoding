package ru.alfabank.Homework4;

public class autoTests {
    public static void main(String[] args) {

        // Счетчики для статистики
        int passCount = 0;
        int flakyCount = 0;
        int bugCount = 0;
        int criticalCount = 0;

        for(int numberTest = 1; numberTest <= 100; numberTest++) {
            String status;

            if(numberTest % 3 == 0 && numberTest % 5 == 0){
                status = "Critical!";
                criticalCount++;
            } else if (numberTest % 3 == 0) {
                status = "Flaky";
                flakyCount++;
            } else if (numberTest % 5 == 0) {
                status = "Bug";
                bugCount++;
            } else {
                status = "Pass";
                passCount++;
        }
            // Выводим результат для каждого теста
            System.out.println("Тест #" +numberTest + ": " + status);
        }

        // Выводим итоговую статистику
        System.out.println("\n===== ИТОГИ НОЧНОЙ СМЕНЫ =====");
        System.out.println("Всего тестов: 100");
        System.out.println("Pass:     " + passCount);
        System.out.println("Flaky:    " + flakyCount);
        System.out.println("Bug:      " + bugCount);
        System.out.println("Critical: " + criticalCount);
    }
}
