package robot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import hands.IHand;
import heads.IHead;
import legs.ILeg;

@AllArgsConstructor
@Getter
@Setter
public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }
}
