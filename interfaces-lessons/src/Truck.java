public class Truck implements Vehicle {
    private static final int MAX_KM_PER_HOUR = 195;
    private int kilomtersPerHour = 0;

    @Override
    public void accelerate() {
        kilomtersPerHour = Math.min(kilomtersPerHour + 10, MAX_KM_PER_HOUR);
    }
 }
