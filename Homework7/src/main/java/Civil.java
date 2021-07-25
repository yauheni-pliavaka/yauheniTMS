import lombok.ToString;

@ToString(callSuper = true)
public class Civil extends AirTransport {
    private final int countPassenger;
    private final boolean businessClass;

    public Civil(double power, double maxSpeed, int weight, String brand, int wingspan, int pathLength, int countPassenger, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingspan, pathLength);
        this.countPassenger = countPassenger;
        this.businessClass = businessClass;
    }

    public String info(int count) {
        if (count <= countPassenger) {
            return "Самолет загружен";
        } else {
            return "Вам нужен самолет побольше";
        }
    }
}
