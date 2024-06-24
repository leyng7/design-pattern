package dock;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("오리 못 날다");
    }

}
