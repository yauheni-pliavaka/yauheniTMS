package heads;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SamsungHead implements IHead {
    private int price;

    @Override
    public void speak() {
        System.out.println("Samsung's head is speaking");
    }

    @Override
    public int getPrice() {
        return price;
    }
}