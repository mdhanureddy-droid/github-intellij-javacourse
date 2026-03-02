package corejavatraining;

public class FirstClass {

    public void getData() {
        System.out.println("I am in method");
    }

    public static void main(String[] args) {
        FirstClass fn = new FirstClass();
        SecondClass sn = new SecondClass();

        fn.getData();
        sn.setData();
        System.out.println("hello world");
    }
}
