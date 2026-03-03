public class SkyViewTester {
    public static void main(String[] args) {
        double[] scanned = { 0.0, 1.1, 2.2, 3.3, 4., 5.5 };
        SkyView sky = new SkyView(3, 2, scanned);
        System.out.println(sky);

        double[] scanned2 = { 0.0, 1.1, 2.2, 3.3, 4., 5.5 };
        SkyView sky2 = new SkyView(3, 2, scanned2);
        System.out.println("Equals: " + sky.equals(sky2));

        System.out.println("Average: " + sky.getAverage(1, 2, 0, 1));

    }
}