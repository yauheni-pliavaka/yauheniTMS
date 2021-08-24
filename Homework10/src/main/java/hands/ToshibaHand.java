package hands;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ToshibaHand implements IHand {
    private int price;

    @Override
    public void upHand() {
        System.out.println("Toshiba's hand went up");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
