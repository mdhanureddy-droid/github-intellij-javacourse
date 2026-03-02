package corejavatraining.abstractdemo;

public class ChildClassDemo extends ParentClassDemo {

    public void engine() {
        System.out.println("engine");
    }

    public void colour() {
        System.out.println(colour);
    }

    public void audioSystem() {
        System.out.println("audioSystem");
    }

    public static void main(String[] args) {
        ChildClassDemo obj = new ChildClassDemo();

        obj.engine();
        obj.gear();
        obj.brakes();
        obj.colour();
        obj.audioSystem();
    }
}
