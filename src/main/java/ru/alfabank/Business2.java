import java.util.Random;

public class Business2 {
    public static void main(String[] args) {
        Random random = new Random();

        int age = random.nextInt(100) + 1; 	//рандомный возраст посетителей от 1 до 99

        double sum = random.nextDouble() * 1_000_000.0; //рандомная сумма на счете
        long roundedSum = Math.round(sum);

        boolean invitation = true;
        boolean blacklist = false;


        //обязательный добровольный взнос
        double donation = (roundedSum / 100) * 7.5;
        long roundedDonation = Math.round(donation);

        //Проходит ли пользователь на бизнес-встречу
        if (age >= 18 && roundedSum > 50_000 && !blacklist && invitation){
            System.out.println("Вход разрешен. Обязательный взнос: " + roundedDonation + " руб");
        } else {
            System.out.println("Вход запрещен");
        }

        System.out.println("--- Данные посетителя ---");
        System.out.println("Возраст: " + age);
        System.out.println("Сумма на счете: " + roundedSum + " руб");
        System.out.println("Приглашение: " + (invitation ? "есть" : "нет"));
        System.out.println("Черный список: " + (blacklist ? "да" : "нет"));
    }
} 