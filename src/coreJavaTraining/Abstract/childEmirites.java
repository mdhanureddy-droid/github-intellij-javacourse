package coreJavaTraining.Abstract;

public class childEmirites extends ParentAirCraft {
 public static void main (String[] args) {
     childEmirites  c = new childEmirites();
    c.engine();
    c.safetyGuidelines();
    c.bodyColur();
     // ParentAirCraft = new ParentAirCraft ();
}


    @Override
    public void bodyColur() {
        System.out.println("bodyCour");
    }
}
