import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double b = sc.nextDouble();

        Addition addition = new Addition();
        double c = addition.add(a, b);

        Substraction substraction = new Substraction();
        double d = substraction.substract(a, b);

        Multiplication multiplication = new Multiplication();
        double e = multiplication.multiply(a,b);

        System.out.println("Результат операций: ");
        System.out.println(a + " + " + b + " = " + c);
        System.out.println(a + " - " + b + " = " + d);
        System.out.println(a + " * " + b + " = " + e);
    }
}
