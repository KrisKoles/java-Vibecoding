package ru.alfabank;

public class Password {
    public static void main(String[] args) {
        String[] passwords = {"AbtQd_9", "1234", "7PWec_J2fQ"};

        // Проверяем каждый пароль
        for (String password : passwords) {
            boolean isValid = validatePassword(password);
            System.out.println("пароль '" + password + "' прошел проверку: " + isValid);
        }
    }

    // Метод для проверки пароля по всем правилам
    public static boolean validatePassword(String password) {
        //Проверка длины (больше 8 символов)
        if (password.length() <= 8) {
            return false;
        }

        //Проверка: не начинается с символа '1'
        if (password.charAt(0) == '1') {
            return false;
        }

        //Проверка: не заканчивается символом 'z'
        if (password.charAt(password.length() - 1) == 'z') {
            return false;
        }

        //Проверка: не содержит последовательность "1234"
        if (password.contains("1234")) {
            return false;
        }

        // Проверка: не содержит последовательность "qwerty"
        if (password.contains("qwerty")) {
            return false;
        }

        // Все проверки пройдены
        return true;
    }
}
