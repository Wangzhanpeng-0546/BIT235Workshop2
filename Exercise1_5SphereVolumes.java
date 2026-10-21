public class Exercise1_5SphereVolumes {
    public static void main(String[] args) {
        final double PI = 3.14;
        double earthDiameter = 7600;
        double sunDiameter = 865000;
        double earthRadius = earthDiameter / 2.0;
        double sunRadius = sunDiameter / 2.0;

        double earthVolume = (4.0 / 3.0) * PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * PI * Math.pow(sunRadius, 3);
        double ratio = sunVolume / earthVolume;

        System.out.printf("Earth volume: %.2f cubic miles%n", earthVolume);
        System.out.printf("Sun volume: %.2f cubic miles%n", sunVolume);
        System.out.printf("Sun-to-Earth volume ratio: %.2f%n", ratio);
    }
}
