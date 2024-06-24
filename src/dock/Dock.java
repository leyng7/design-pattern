package dock;

public abstract class Dock {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Dock(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("한강 위에 둥둥 뜨는 오리");
    }

}
