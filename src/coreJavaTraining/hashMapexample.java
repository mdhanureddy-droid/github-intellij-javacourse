package coreJavaTraining;

import groovy.util.MapEntry;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapexample {
    public static void main(String[] args) {
        // key value pairs
        // key cannot be duplicate
        // values can be duplicate
        // HashMap is non synchronized
        // it is not ordered
        // it can have one null key and multiple null values

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0,"hello");
        hm.put(1, "hello");
        hm.put(42, "welcome");
        hm.put(3, "to");
        hm.put(4,null);
        System.out.println(hm.get(42));
        System.out.println(hm);
       // hm.remove(42);
       // System.out.println(hm);
        System.out.println(hm.get(42));
        Set sn = hm.entrySet();
        Iterator it = sn.iterator();
        while(it.hasNext()){
          Map.Entry mp= (Map.Entry)it.next();
          mp.getKey();
          mp.getValue();
          System.out.println(mp.getKey()+"   "+mp.getValue());
        }

    }
}
