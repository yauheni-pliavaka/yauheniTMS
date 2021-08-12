package heads;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ToshibaHead implements IHead {
    private int price;

    @Override
    public void speak() {
        System.out.println("Toshiba's head is speaking");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
