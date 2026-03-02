package corejavatraining.abstractdemo;

public abstract class ParentAircraft {

    public void engine() {
        System.out.println("Follow engine guidelines");
    }

    public void safetyGuidelines() {
        System.out.println("Follow safety guidelines");
    }

    public abstract void bodyColour();
}
