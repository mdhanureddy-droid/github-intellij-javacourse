package coreJavaTraining;

public class Multideomentional {

    public static void main (String[] args) {

        int a[][] = new int[2][3];
        a[0][0] = 2;
        a[0][1] = 4;
        a[0][2] = 5;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 7;

      /*  int b[][] = {{1,2,3},{4,5,6}};
        //System.out.println(a[0][2]);
        System.out.println(b[1][1]); */

        for ( int i=0;i<2;i++) // roq
        {
            for (int j=0;j<3;j++) // column
                System.out.println(a[i][j]);

        }

    }
}
