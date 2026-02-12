package coreJavaTraining.Abstract;

public class childClassDemo extends parentClassDemo {
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
        childClassDemo obj = new childClassDemo();
        obj.engine();
        obj.Gear();
        obj.brakes();
        obj.colour();
        obj.audioSystem();
    }
}

