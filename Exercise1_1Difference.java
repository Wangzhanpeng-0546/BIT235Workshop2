import java.util.Scanner;

public class Exercise1_1Difference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNumber = input.nextInt();

        int difference = firstNumber - secondNumber;
        System.out.println("The difference is " + difference);
        input.close();
    }
}
