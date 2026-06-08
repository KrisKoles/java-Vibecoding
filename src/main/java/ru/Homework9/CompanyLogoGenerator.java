package ru.Homework9;
import java.io.IOException;
import java.util.Random;
import com.github.lalyos.jfiglet.FigletFont;
import net.datafaker.Faker;


public class CompanyLogoGenerator {

    // Метод для генерации случайной фамилии из массива
    public static String getRandomLastNameFromArray() {
        // Массив с фамилиями
        String[] lastNames = {
                "Smith",
                "Johnson",
                "Williams",
                "Brown",
                "Jones",
                "Garcia",
                "Miller",
                "Davis"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(lastNames.length);
        return lastNames[randomIndex];
    }

    // Метод для генерации логотипа
    public static void generateLogo() throws IOException {
        // 1. Первая фамилия - из нашего массива
        String lastName1 = getRandomLastNameFromArray();

        // 2. Символ "&" (просто строка)
        String ampersand = "&";

        // 3. Вторая фамилия - через DataFaker
        Faker faker = new Faker();
        String lastName2 = faker.name().lastName();

        // Выводим название компании (обычный текст)
        System.out.println("Сгенерированное название: " + lastName1 + " " + ampersand + " " + lastName2);
        System.out.println();

        System.out.println("=========================================");
        System.out.println("                ЛОГОТИП                 ");
        System.out.println("=========================================");
        System.out.println();

        // Отрисовываем каждую часть с помощью JFiglet
        String asciiLastName1 = FigletFont.convertOneLine(lastName1);
        String asciiAmpersand = FigletFont.convertOneLine(ampersand);
        String asciiLastName2 = FigletFont.convertOneLine(lastName2);

        // Выводим ASCII-логотип
        System.out.println(asciiLastName1);
        System.out.println(asciiAmpersand);
        System.out.println(asciiLastName2);

        // Генерируем данные с помощью уже созданного объекта faker
        String contactPerson = faker.name().fullName();
        String phone = faker.phoneNumber().cellPhone();
        String address = faker.address().fullAddress();

        System.out.println("Контактное лицо: " + contactPerson);
        System.out.println("Телефон: " + phone);
        System.out.println("Адрес: " + address);

    }

    public static void main(String[] args) {
        try {
            generateLogo();
        } catch (IOException e) {
            System.err.println("Ошибка при генерации ASCII-логотипа: " + e.getMessage());
        }
    }
}
