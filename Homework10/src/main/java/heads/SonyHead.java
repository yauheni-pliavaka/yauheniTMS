package heads;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SonyHead implements IHead {
    private int price;

    @Override
    public void speak() {
        System.out.println("Sony's head is speaking");
    }

    @Override
    public int getPrice() {
        return price;
    }
}