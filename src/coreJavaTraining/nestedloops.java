package coreJavaTraining;

public class nestedloops {

    public static void main (String[] args) {

        for ( int i=1; i<4;i++)
        {
            System.out.println("outerloop started");
            for ( int j=1; j<4;j++)
            {
                System.out.println("innerloop");
            }
            System.out.println("outer loop finished");
        }
    }


}
