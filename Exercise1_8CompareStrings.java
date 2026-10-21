import java.util.Scanner;

public class Exercise1_8CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = input.nextLine();
        System.out.print("Enter the second string: ");
        String second = input.nextLine();

        System.out.println("The two given strings are equal: " + first.equals(second));

        if (first.isEmpty() || second.isEmpty()) {
            System.out.println("At least one string is empty, so a first character cannot be compared.");
        } else {
            System.out.println("The first characters are equal: " + (first.charAt(0) == second.charAt(0)));
        }
        input.close();
    }
}
