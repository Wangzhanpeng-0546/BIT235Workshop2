public class Exercise1_4CompoundInterest {
    public static void main(String[] args) {
        double principal = 5000.00;
        double rate = 0.04;
        int years = 10;
        double amount = principal * Math.pow(1 + rate, years);

        System.out.printf("Amount after %d years: $%.2f%n", years, amount);
    }
}
