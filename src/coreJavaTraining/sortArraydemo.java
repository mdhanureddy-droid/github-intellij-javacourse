package coreJavaTraining;

public class sortArraydemo {

    public static void main (String[] args) {

   /*    /* int a = 4;
        int b = 5;
        int temp;
        temp = a;
        a= b;
        b = temp;

        System.out.println(a);
        System.out.println(b); */

 /*   int a = 4;
        int b = 5;

        a= a+b;
        b= a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);  */

        int a[] = {2,6,1,4,9};
        int temp;

        for (int i=0;i<5;i++)
        {
            for (int j=i+1;j<5;j++)
            {
                if(a[i] > a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }

        }
        for (int i=0;i<5;i++)

        {
            System.out.println(a[i]);
        }





    }


}
