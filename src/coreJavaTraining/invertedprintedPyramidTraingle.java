package coreJavaTraining;

public class invertedprintedPyramidTraingle {

    public static void main (String[] args) {
        int k = 1;
        for ( int i=1; i<5;i++)
        {
            // System.out.println("outerloop started");
            for ( int j=1; j<=i;j++)
            {
                System.out.print ( k);
                System.out.print("\t");
                k++;
            }
            System.out.println(k);
        }

    }

}

