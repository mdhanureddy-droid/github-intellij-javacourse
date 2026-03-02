package corejavatraining.inheritance;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

    public static void main(String[] args) {
        CentralTraffic a = new AustralianTraffic();

        a.redStop();
        a.flashYellow();
        a.greenGo();

        AustralianTraffic at = new AustralianTraffic();
        ContinentalTraffic ct = new AustralianTraffic();

        at.walkOnSymbol();
        ct.trainSymbol();
    }

    @Override
    public void redStop() {
        System.out.println("redstop implementation");
    }

    public void walkOnSymbol() {
        System.out.println("walking");
    }

    @Override
    public void flashYellow() {
        System.out.println("flash yellow implementation");
    }

    @Override
    public void greenGo() {
        System.out.println("Green go implementation");
    }

    @Override
    public void trainSymbol() {
        System.out.println("Train");
    }
}
