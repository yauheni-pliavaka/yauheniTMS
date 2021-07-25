import lombok.ToString;

@ToString(callSuper = true)
public class Military extends AirTransport {
    private final boolean ejection;
    private int countRocket;

    public Military(double power, double maxSpeed, int weight, String brand, int wingspan, int pathLength, boolean ejection, int countRocket) {
        super(power, maxSpeed, weight, brand, wingspan, pathLength);
        this.ejection = ejection;
        this.countRocket = countRocket;
    }

    public String shot() {
        if (countRocket != 0) {
            countRocket -= 1;
            return "Ракета пошла…";
        } else {
            return "Боеприпасы отсутствуют";
        }
    }

    public String checkEjection() {
        if (ejection) {
            return "Катапультирование прошло успешно";
        } else {
            return "У вас нет такой системы";
        }
    }
}
