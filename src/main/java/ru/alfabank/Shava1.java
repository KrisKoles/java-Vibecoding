public class Shava1 {
    public static void main(String[] args) {
        String employeeName = "Глеб";
        String post = "Старший шаурма-инженер";
        double ratePerShift = 2000.0; 		//ставка за одну смену
        int numberOfShifts = 8;		  		//количество смен
        double bonus = 3000.0;		  		//премия
        double penaltyForBurntPita = 500.0;	//штраф за подгоревший лаваш
        double shawarmaPrice = 300.0;		//цена 1 шаурмы
        int shawarmaSold = 3000;            //количество штук проданной шаурмы

        //вычисляем зарплату без премии
        double salaryWithoutBonuses = ratePerShift * numberOfShifts;

        //Вычисляем итоговую зарплату с учетом премии и штрафом
        double totalSalary = salaryWithoutBonuses + bonus - penaltyForBurntPita;

        //вычисляем выручку
        double revenue = shawarmaPrice * shawarmaSold;

        System.out.println("Сотрудник: " + employeeName);
        System.out.println("Должность: " + post);
        System.out.println("Зарплата без премии: " + salaryWithoutBonuses); //зарплата без премии
        System.out.println("Штраф: " + penaltyForBurntPita); //штраф
        System.out.println("Премия: " + bonus); //премия
        System.out.println("Итоговая зарплата: " + totalSalary); //итоговая зарплата
        System.out.println("Выручка: " + revenue); //выручка

    }
}