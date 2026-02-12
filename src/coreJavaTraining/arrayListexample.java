package coreJavaTraining;

import java.util.ArrayList;

public class arrayListexample {
   // can accept duplicate values
    // ArrayList , LinkedList, Vector - implementing List Interface
    // array has fixed sizes where as ArrayList grow dynamically
    // we can access and insert any value in any index
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.add("dhanunjaya");
        a.add("reddy");
        a.add("reddy");
        System.out.println(a);
        a.add(0,"student");
       // System.out.println(a);
      //  a.remove(1);
          System.out.println(a);
       // a.remove("student");
       // System.out.println(a);
       // System.out.println(a.get(2));
       // System.out.println(a.contains("test"));
       // System.out.println(a.indexOf("dhanunjaya"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
    }
}
