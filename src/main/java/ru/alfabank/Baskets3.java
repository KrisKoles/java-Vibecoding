package ru.alfabank;
import java.util.ArrayList;
import java.util.Arrays;

public class Baskets3 {
    public static void main(String[] args) {
        String[] basketPetya = {"Chicken", "Bananas", "Curd"};
        String[] basketKolya = {"Chicken", "Bananas", "Curd"};
        String[] basketTerenty = {"Beer", "Dumplings", "Laska magic of black"};

        //сравнение по количеству продуктов в корзине Пети и Коли
        if (basketPetya.length == basketKolya.length) {
            System.out.println("The number of products in Petya's and Kolya's baskets is the same: " + basketPetya.length);
        } else {
            System.out.println("The number of products in Petya's and Kolya's baskets is different");
        }

        //сравнение по количеству продуктов в корзине Пети и Терентия
        if (basketPetya.length == basketTerenty.length) {
            System.out.println("The number of products in Petya's and Terenty's baskets is the same: " + basketPetya.length);
        } else {
            System.out.println("The number of products in Petya's and Terenty's baskets is different");
        }

        //сравнение содержимого корзин Пети и Коли
        if (Arrays.equals(basketPetya, basketKolya)) {
            System.out.println("Petya's and Kolya's baskets match");
        } else {
            System.out.println("Petya and Kolya's baskets are different");
        }

        //Сравнение содержимого корзин Пети и Терентия
        if (Arrays.equals(basketPetya, basketTerenty)) {
            System.out.println("Petya and Terenty's baskets match");
        } else {
            System.out.println("Petya and Terenty's baskets are different");
        }

        //объединяем все массивы в одну корзину
        ArrayList<String> allProducts = new ArrayList<>();
        allProducts.addAll(Arrays.asList(basketPetya));
        allProducts.addAll(Arrays.asList(basketKolya));
        allProducts.addAll(Arrays.asList(basketTerenty));

        //Ищем самый длинный и самый короткий продукт
        String longestProduct = allProducts.get(0);
        String shortestProduct = allProducts.get(0);
        int totalLength = 0;  // сумма длин всех продуктов

        for (int i = 0; i < allProducts.size(); i++) {
            String currentProduct = allProducts.get(i);
            totalLength = totalLength + currentProduct.length();
            // Проверяем на самый длинный
            if (currentProduct.length() > longestProduct.length()) {
                longestProduct = currentProduct;
            }

            // Проверяем на самый короткий
            if (currentProduct.length() < shortestProduct.length()) {
                shortestProduct = currentProduct;
            }
        }
        //Вычисляем среднюю длину
        double averageLength = (double) totalLength / allProducts.size();

        System.out.println(" The longest product: " + longestProduct );
        System.out.println("The shortest product: " + shortestProduct );
        System.out.printf("Average length: %.2f letters'%n", averageLength);
    }
}
