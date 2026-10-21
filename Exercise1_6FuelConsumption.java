public class Exercise1_6FuelConsumption {
    public static void main(String[] args) {
        double tankCapacity = 40.0;
        double normalFuelUse = 8.0; // litres per 100 kilometres
        double roughFuelUse = normalFuelUse * 1.15;

        double normalDistance = tankCapacity / normalFuelUse * 100;
        double roughDistance = tankCapacity / roughFuelUse * 100;

        System.out.printf("Distance on a normal road: %.2f km%n", normalDistance);
        System.out.printf("Distance on a rough road: %.2f km%n", roughDistance);
    }
}
