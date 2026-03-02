package corejavatraining.superdemo;

public class SuperChildDemo extends SuperParentDemo {

    String name = "QAClickAcademy";

    public SuperChildDemo() {
        super();
        System.out.println("child class constructor");
    }

    public void getStringData() {
        System.out.println(name);
        System.out.println(super.name);
    }

    public void getData() {
        super.getData();
        System.out.println("I am in child class");
    }

    public static void main(String[] args) {
        SuperChildDemo cd = new SuperChildDemo();

        cd.getStringData();
        cd.getData();
    }
}
