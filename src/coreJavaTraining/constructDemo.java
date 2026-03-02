package corejavatraining;

public class ConstructDemo {

    public ConstructDemo() {
        System.out.println("I am in the constructor");
        System.out.println("I am in the constructor lecture 1");
    }

    public ConstructDemo(int a, int b) {
        System.out.println("I am in the parameterized constructor");
        int c = a + b;
        System.out.println(c);
    }

    public ConstructDemo(String str) {
        System.out.println(str);
    }

    public void getData() {
        System.out.println("I am the method");
    }

    public static void main(String[] args) {
        ConstructDemo cd = new ConstructDemo();
        ConstructDemo cds = new ConstructDemo("hello");
        ConstructDemo c = new ConstructDemo(4, 5);
    }
}