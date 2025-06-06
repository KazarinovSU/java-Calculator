import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        System.out.println("Консольный калькулятор");
        while (menu) {
            System.out.println("\nВыберите операцию:");
            System.out.println("1. Сложение (+)");
            System.out.println("2. Вычитание (-)");
            System.out.println("3. Умножение (*)");
            System.out.println("4. Деление (/)");
            System.out.println("5. Выход");
            System.out.print("Ваш выбор: ");
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Выход из программы.");
                break;
            }
            System.out.print("Введите первое число: ");
            double numOne = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double numTwo = scanner.nextDouble();
            double result = 0;
            boolean valid = true;
            switch (choice) {
                case 1:
                    result = add(numOne, numTwo);
                    break;
                case 2:
                    result = subtract(numOne, numTwo);
                    break;
                case 3:
                    result = multiply(numOne, numTwo);
                    break;
                case 4:
                    if (numTwo == 0) {
                        System.out.println("Ошибка: деление на ноль!");
                        valid = false;
                    } else {
                        result = divide(numOne, numTwo);
                    }
                    break;
                default:
                    System.out.println("Неверный выбор.");
                    valid = false;
            }
            if (valid) {
                System.out.println("Результат: " + result);
            }
        }
        scanner.close();
    }
}