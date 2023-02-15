package task5;

import java.util.Scanner;

public class Main {

    // Ускорение свободного падения Земли
    private static final double G_EARTH = 9.80665;

    // Ускорение свободного падения Марса
    private static final double G_MARS = 3.721;

    // Количество топлива для вывода 1 кг на орбиту Марса
    private static final double COUNT_FUEL_ONE_KILOGRAM = G_MARS * 100 / G_EARTH;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите количество топлива");

        // Вес груза для отправки на орбиту Марса
        int weight = keyboard.nextInt();

        System.out.println("Количество топлива потребуется " + weight * COUNT_FUEL_ONE_KILOGRAM + " кг.");

    }
}
