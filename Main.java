import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        // Операторы сравнения
        System.out.println("\n--- Сравнение ---");
        System.out.println(a + " == " + b + " -> " + (a == b));
        System.out.println(a + " != " + b + " -> " + (a != b));
        System.out.println(a + " >  " + b + " -> " + (a > b));
        System.out.println(a + " <  " + b + " -> " + (a < b));
        System.out.println(a + " >= " + b + " -> " + (a >= b));
        System.out.println(a + " <= " + b + " -> " + (a <= b));

        if (a > b) {
            System.out.println("Первое число больше второго");
        } else if (a < b) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }

        // Арифметические операции
        System.out.println("\n--- Арифметика ---");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));

        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b) + " (целочисленное деление)");
            System.out.println(a + " / " + b + " = " + ((double) a / b) + " (с дробной частью)");
            System.out.println(a + " % " + b + " = " + (a % b) + " (остаток от деления)");
            System.out.println(a + " составляет " + ((double) a / b * 100) + "% от " + b);
        } else {
            System.out.println("Делить на ноль нельзя!");
        }

        // Процент от числа
        System.out.print("\nВведите процент, который нужно найти от первого числа: ");
        double percent = scanner.nextDouble();
        System.out.println(percent + "% от " + a + " = " + (a * percent / 100));

        // Сравнение строк: через equals(), а не ==
        System.out.println("\n--- Строки ---");
        String s1 = "java";
        String s2 = new String("java");
        System.out.println("s1 == s2 -> " + (s1 == s2));
        System.out.println("s1.equals(s2) -> " + s1.equals(s2));

        scanner.close();
    }
}