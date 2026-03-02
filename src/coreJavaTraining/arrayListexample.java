package corejavatraining;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("dhanunjaya");
        a.add("reddy");
        a.add("reddy");
        System.out.println(a);

        a.add(0, "student");
        System.out.println(a);
        System.out.println(a.isEmpty());
        System.out.println(a.size());
    }
}
