package ru.Homework14;

public class XMLUtils {

    public static String createEmptyElement(String tagName){
        // Проверка на null или пустую строку
        if (tagName == null || tagName.trim().isEmpty()) {
            return "<invalid/>";
        }

        // Возвращаем открывающий и закрывающий тег
        return "<" + tagName + "></" + tagName + ">";

    }
}
