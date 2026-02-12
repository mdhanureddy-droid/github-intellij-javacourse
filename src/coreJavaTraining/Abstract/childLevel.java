package coreJavaTraining.Abstract;

// function overloading
// either argument count should be different or argument type should be different


public class childLevel extends childClassDemo {
public void colour ( int a) {
    System.out.println(a);
}

public void colour ( String a) {
    System.out.println(a);
}
    public void colour ( int a, int b) {
        System.out.println(b);
    }

 public static void main(String[] args) {
    childLevel obj = new childLevel();
    obj.colour(2);
    obj.colour("sdf");
    obj.colour(2,5);

 }
}

