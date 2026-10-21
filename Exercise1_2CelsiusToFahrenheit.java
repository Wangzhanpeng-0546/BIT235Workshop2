import java.util.Scanner;

public class Exercise1_2CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", celsius, fahrenheit);
        input.close();
    }
}
