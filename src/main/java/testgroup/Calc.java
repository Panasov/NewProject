package testgroup;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double first, second;
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка! Введите корректное число: ");
            scanner.next();
        }
        first = scanner.nextDouble();

        System.out.println("Введите второе число: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка! Введите корректное число: ");
            scanner.next();
        }
        second = scanner.nextDouble();

        System.out.println("Введите операцию: ");
        char operation = scanner.next().charAt(0);
        double result = 0;
        boolean error = false;

        switch (operation) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                if (second == 0) {
                    System.out.println("Делить на 0 нельзя!");
                    error = true;
                } else {
                    result = first / second;
                }
                break;
            default:
                System.out.println("Ошибка! Можно ввести только: + - * /");
                error = true;
                break;
        }
        if (!error) {
            System.out.println("Ответ: " + result);
        }
        scanner.close();
    }
}
