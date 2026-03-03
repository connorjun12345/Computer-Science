public class DecompositionDemo {
    public static void main(String[] args) {
        bigMethodToDecompose();
    }

    // This method is intentionally long and mixes many responsibilities.
    public static void bigMethodToDecompose() {
        // Daily Steps Analysis (12 hours): parallel arrays, arrays only
        int[] hours = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int[] steps = new int[] { 120, 90, 60, 50, 80, 300, 1200, 2200, 2800, 2500, 1800, 900 };
        int[] activeMinutes = new int[] { 2, 1, 0, 0, 1, 10, 35, 50, 55, 48, 32, 15 };

        // Validate equal lengths
        int n = hours.length;
        if (steps.length != n || activeMinutes.length != n) {
            System.out.println("Invalid input: arrays must be the same length.");
            return;
        }

        // Total and average steps
        int totalSteps = 0;
        int minSteps = Integer.MAX_VALUE;
        int maxSteps = Integer.MIN_VALUE;
        int maxStepsHour = -1;
        for (int i = 0; i < n; i++) {
            int s = steps[i];
            totalSteps += s;
            if (s < minSteps)
                minSteps = s;
            if (s > maxSteps) {
                maxSteps = s;
                maxStepsHour = hours[i];
            }
        }
        double avgSteps = totalSteps / (double) n;

        // Active minutes summary
        int totalActiveMinutes = 0;
        int activeHourCount = 0; // >= 30 minutes counts as active hour
        for (int i = 0; i < n; i++) {
            totalActiveMinutes += activeMinutes[i];
            if (activeMinutes[i] >= 30) {
                activeHourCount += 1;
            }
        }
        double avgActiveMinutes = totalActiveMinutes / (double) n;

        // Morning vs Midday vs Afternoon averages
        // Morning: 0-3, Midday: 4-7, Afternoon: 8-11
        int sumMorning = 0, cntMorning = 0;
        int sumMidday = 0, cntMidday = 0;
        int sumAfternoon = 0, cntAfternoon = 0;
        for (int i = 0; i < n; i++) {
            if (i <= 3) {
                sumMorning += steps[i];
                cntMorning += 1;
            } else if (i <= 7) {
                sumMidday += steps[i];
                cntMidday += 1;
            } else {
                sumAfternoon += steps[i];
                cntAfternoon += 1;
            }
        }
        double avgMorning = cntMorning == 0 ? 0 : (sumMorning / (double) cntMorning);
        double avgMidday = cntMidday == 0 ? 0 : (sumMidday / (double) cntMidday);
        double avgAfternoon = cntAfternoon == 0 ? 0 : (sumAfternoon / (double) cntAfternoon);

        // Print a small report
        System.out.println("=== Daily Steps Report (Demo) ==="
                + "\nHours recorded: " + n
                + "\nTotal steps: " + totalSteps
                + "\nAverage steps/hour: " + round2(avgSteps)
                + "\nMin steps in an hour: " + minSteps + "\nMax steps in an hour: " + maxSteps + " at hour "
                + maxStepsHour
                + "\nTotal active minutes: " + totalActiveMinutes
                + "\nActive hours (>=30 min): " + activeHourCount
                + "\nAverage steps - Morning(0-3): " + round2(avgMorning)
                + "\nAverage steps - Midday(4-7): " + round2(avgMidday)
                + "\nAverage steps - Afternoon(8-11): " + round2(avgAfternoon));

        // Hourly lines
        System.out.println("--- Hourly (h, steps, activeMin) ---");
        for (int i = 0; i < n; i++) {
            System.out.println(hours[i] + ", " + steps[i] + ", " + activeMinutes[i]);
        }
    }

    // helper to round to 2 decimals without external libs
    private static double round2(double x) {
        return Math.round(x * 100.0) / 100.0;
    }
}