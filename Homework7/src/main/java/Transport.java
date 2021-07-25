import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transport {
    private double power;
    private double maxSpeed;
    private int weight;
    private String brand;

    public Transport(double power, double maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power * 0.74 +
                "(kW), maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
