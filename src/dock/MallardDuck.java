package dock;

public class MallardDuck extends Dock {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("저는 물 오리입니다.");
    }

}
