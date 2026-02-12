package coreJavaTraining;

public class StringBufferBuilder {

    public static void main(String[] args) {

        String a = "hello";
        String b = "hello";
        String c = a.concat("world");
        System.out.println(a);
        String s = new String("hello");
        String s1 = new String("hello"); // String class creates new object every time in memory

        System.out.println(a.equals(b)); //true
        System.out.println(a==b); //true
        System.out.println(a.equals(s)); // equal operator checks for content true
        System.out.println(a==s); // fail matching reference ==
        System.out.println(s==s1); // fail references are different as they are defined with String class
        System.out.println(s.equals(s1));

        // StringBuffer and StringBuilder - Mutable
        StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        System.out.println(sb);
        sb.insert(2,"She");
        System.out.println(sb);
        sb.replace(5,7,"aa");
        System.out.println(sb);
        sb.deleteCharAt(12);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        //StringBuilder is not threadsafe and It is not synchronozed
        StringBuilder spb = new StringBuilder("hello");
        spb.append("world");
        System.out.println(spb);


    }

}
