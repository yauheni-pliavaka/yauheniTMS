package hands;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SonyHand implements IHand {
    private int price;

    @Override
    public void upHand() {
        System.out.println("Sony's hand went up");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}