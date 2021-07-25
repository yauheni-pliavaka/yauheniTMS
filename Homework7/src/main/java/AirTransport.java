import lombok.ToString;

@ToString(callSuper = true)
public class AirTransport extends Transport {
    private final int wingspan;
    private final int pathLength;

    public AirTransport(double power, double maxSpeed, int weight, String brand, int wingspan, int pathLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.pathLength = pathLength;
    }
}
