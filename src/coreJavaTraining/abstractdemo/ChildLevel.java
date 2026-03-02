package corejavatraining.abstractdemo;

public class ChildLevel extends ChildClassDemo {

    public void colour(int a) {
        System.out.println(a);
    }

    public void colour(String a) {
        System.out.println(a);
    }

    public void colour(int a, int b) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        ChildLevel obj = new ChildLevel();

        obj.colour(2);
        obj.colour("sdf");
        obj.colour(2, 5);
    }
}
