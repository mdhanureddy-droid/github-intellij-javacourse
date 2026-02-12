package coreJavaTraining;

import java.util.HashSet;
import java.util.Iterator;

public class hastSetexample {
    public static void main(String[] args) {
  // Hashset , treeset , LinkedHashSet implements Set Interface
        // does not accept duplicate values
        // there is no guarantee on insertion order..random order
        // if we want to sort the values we will use treeset

        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("UK");
        hs.add("INDIA");
        hs.add("he");
        hs.add("she");
        System.out.println(hs);
       // System.out.println(hs.remove("UK"));
       // System.out.println(hs.isEmpty());
       // System.out.println(hs.size());

        Iterator<String> i = hs.iterator();
        //System.out.println(i.next());
        //System.out.println(i.next());
               while(i.hasNext()){
            System.out.println(i.next());
        }



    }
}
