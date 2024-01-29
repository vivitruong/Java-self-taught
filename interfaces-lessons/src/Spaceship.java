public class Spaceship  implements Vehicle{
    private double percentOfLightSpeed = 0.0;

    @Override
    public void accelerate() {
        percentOfLightSpeed += (0.1 * (1.0 - percentOfLightSpeed));
    }
}
