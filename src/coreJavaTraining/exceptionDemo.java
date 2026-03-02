package corejavatraining;

public class ExceptionDemo {

    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = 0;

        try {
            int[] arr = new int[5];
            System.out.println(arr[7]);
        } catch (ArithmeticException et) {
            System.out.println("I catched Arithmetic exception");
        } catch (IndexOutOfBoundsException ie) {
            System.out.println("I catched Indexoutofbound exception");
        } catch (Exception e) {
            System.out.println("I catched exception");
        } finally {
            System.out.println("I am still executing");
        }
    }
}
