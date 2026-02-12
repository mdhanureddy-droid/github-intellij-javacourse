package coreJavaTraining;

//one try can be followed by mutiplle catch blocks
//catch should be an immediate block after try

public class exceptionDemo {

    public static void main(String[] args) {
        int a = 4;
        int b= 7;
        int c = 0;

        try {

     //         int k = b / c;
            int arr[] =new int[5];
          //  System.out.println(k);
            System.out.println(arr[7]);

        }
catch (ArithmeticException et)

        {
            System.out.println("I catched Arthimetic exception");
        }
catch (IndexOutOfBoundsException Ie)
        {
            System.out.println("I catched Indexoutofbound exception");
        }
        catch (Exception e)

        {
            System.out.println("I catched  exception");
        }

        finally {
            // this block is executed irrespective of exception thrown or not
            System.out.println("I am still executing");
        }


    }
}
