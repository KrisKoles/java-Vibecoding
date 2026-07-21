package ru.Homework14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class XMLUtilsTest {
    @Test
    void createEmptyElement_withValidTag_returnsCorrectXml() {
        // Arrange (подготовка)
        String tagName = "user";
        String expected = "<user></user>";

        // Act (выполнение)
        String result = XMLUtils.createEmptyElement(tagName);

        // Assert (проверка)
        assertEquals(expected, result,
                "Для тега 'user' должна возвращаться строка '<user></user>'");
    }
    @Test
    void reateEmptyElement_withNull_returnsInvalid(){
        // Arrange (подготовка)
        String tagName = null;
        String expected = "<invalid/>";

        // Act (выполнение)
        String result = XMLUtils.createEmptyElement(tagName);

        // Assert (проверка)
        assertEquals(expected, result,
                "При передаче null должна возвращаться строка <invalid/>");
    }

    @Test
    void createEmptyElement_withEmptyString_returnsInvalid(){
        // Arrange (подготовка)
        String tagName = "";
        String expected = "<invalid/>";

        // Act (выполнение)
        String result = XMLUtils.createEmptyElement(tagName);

        // Assert (проверка)
        assertEquals(expected, result,
                "При передаче пустой строки должна возвращаться строка <invalid/>");
    }

}
