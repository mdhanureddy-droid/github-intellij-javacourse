package coreJavaTraining;

public class reverseString {
    public static void main(String[] args) {
        // String is a class in java
        // String literal
        String s = "madam";
        String t = "";

        // Reverse the string using a loop
        for (int i=s.length()-1;i>=0;i--) {
            t = t + s.charAt(i);
        }
        System.out.println(t);
        // Check if the original string is equal to the reversed string
        if (s.equals(t)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
