package legs;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SonyLeg implements ILeg {
    private final int price;

    @Override
    public void step() {
        System.out.println("Toshiba's leg made a step");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
