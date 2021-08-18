import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car {
    private String model;
    private int speed;
    private int price;

    public void startMoving() throws CarException {
        Random random = new Random();
        int number = random.nextInt(2);
        System.out.println(number);
        if (number == 0) {
            throw new CarException("Car " + getModel() + " can't moving");
        } else {
            System.out.println("Car " + getModel() + " is moving");
        }
    }
}