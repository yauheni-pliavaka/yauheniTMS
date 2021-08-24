package hands;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SamsungHand implements IHand {
    private int price;

    @Override
    public void upHand() {
        System.out.println("Samsung's hand went up");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}